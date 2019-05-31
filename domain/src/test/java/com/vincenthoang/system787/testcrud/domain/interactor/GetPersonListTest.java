package com.vincenthoang.system787.testcrud.domain.interactor;

import com.vincenthoang.system787.testcrud.domain.executor.PostExecutionThread;
import com.vincenthoang.system787.testcrud.domain.executor.ThreadExecutor;
import com.vincenthoang.system787.testcrud.domain.repository.PersonRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;

@RunWith(MockitoJUnitRunner.class)
public class GetPersonListTest {

    private GetPersonList mGetPersonList;

    @Mock
    private ThreadExecutor mockThreadExecutor;
    @Mock
    private PostExecutionThread mockPostExecutionThread;
    @Mock
    private PersonRepository mockPersonRepository;

    @Before
    public void setUp() {
        mGetPersonList = new GetPersonList(mockPersonRepository, mockThreadExecutor,
                mockPostExecutionThread);
    }

    @Test
    public void testGetPersonListUseCaseObservablePassCase() {
        mGetPersonList.buildUseCaseObservable(null);

        verify(mockPersonRepository).persons();
        verifyNoMoreInteractions(mockPersonRepository);
        verifyZeroInteractions(mockThreadExecutor);
        verifyZeroInteractions(mockPostExecutionThread);
    }
}
