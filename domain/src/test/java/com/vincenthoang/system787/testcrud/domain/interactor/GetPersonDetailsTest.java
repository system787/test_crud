package com.vincenthoang.system787.testcrud.domain.interactor;

import com.vincenthoang.system787.testcrud.domain.executor.PostExecutionThread;
import com.vincenthoang.system787.testcrud.domain.executor.ThreadExecutor;
import com.vincenthoang.system787.testcrud.domain.interactor.GetPersonDetails.Params;
import com.vincenthoang.system787.testcrud.domain.repository.PersonRepository;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;

@RunWith(MockitoJUnitRunner.class)
public class GetPersonDetailsTest {

    private static final int PERSON_ID = 123;

    private GetPersonDetails mGetPersonDetails;

    @Mock
    private PersonRepository mockPersonRepository;
    @Mock
    private ThreadExecutor mockThreadExecutor;
    @Mock
    private PostExecutionThread mockPostExecutionThread;

    @Rule
    public ExpectedException mExpectedException = ExpectedException.none();

    @Before
    public void setUp() {
        mGetPersonDetails = new GetPersonDetails(mockPersonRepository, mockThreadExecutor,
                mockPostExecutionThread);
    }

    @Test
    public void testGetPersonDetailsUseCaseObservablePassCase() {
        mGetPersonDetails.buildUseCaseObservable(Params.forPerson(PERSON_ID));

        verify(mockPersonRepository).person(PERSON_ID);
        verifyNoMoreInteractions(mockPersonRepository);
        verifyZeroInteractions(mockPostExecutionThread);
        verifyZeroInteractions(mockThreadExecutor);
    }

    @Test
    public void testShouldFailWhenNoOrEmptyParameters() {
        mExpectedException.expect(NullPointerException.class);
        mGetPersonDetails.buildUseCaseObservable(null);
    }
}
