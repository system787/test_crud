package com.vincenthoang.system787.testcrud.domain.interactor;

import com.vincenthoang.system787.testcrud.domain.executor.PostExecutionThread;
import com.vincenthoang.system787.testcrud.domain.executor.ThreadExecutor;
import com.vincenthoang.system787.testcrud.domain.repository.CarRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;

@RunWith(MockitoJUnitRunner.class)
public class GetCarListTest {

    private GetCarList mGetCarList;

    @Mock
    private ThreadExecutor mockThreadExecutor;
    @Mock
    private PostExecutionThread mockPostExecutionThread;
    @Mock
    private CarRepository mockCarRepository;

    @Before
    public void setUp() {
        mGetCarList = new GetCarList(mockCarRepository, mockThreadExecutor,
                mockPostExecutionThread);
    }

    @Test
    public void testGetCarListUseCaseObservablePassCase() {
        mGetCarList.buildUseCaseObservable(null);

        verify(mockCarRepository).cars();
        verifyNoMoreInteractions(mockCarRepository);
        verifyZeroInteractions(mockThreadExecutor);
        verifyZeroInteractions(mockPostExecutionThread);
    }
}
