package com.vincenthoang.system787.testcrud.domain.interactor;

import com.vincenthoang.system787.testcrud.domain.executor.PostExecutionThread;
import com.vincenthoang.system787.testcrud.domain.executor.ThreadExecutor;
import com.vincenthoang.system787.testcrud.domain.interactor.GetCarDetails.Params;
import com.vincenthoang.system787.testcrud.domain.repository.CarRepository;
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
public class GetCarDetailsTest {

    private static final int CAR_ID = 123;

    private GetCarDetails mGetCarDetails;

    @Mock
    private CarRepository mockCarRepository;
    @Mock
    private ThreadExecutor mockThreadExecutor;
    @Mock
    private PostExecutionThread mockPostExecutionThread;

    @Rule
    public ExpectedException mExpectedException = ExpectedException.none();

    @Before
    public void setUp() {
        mGetCarDetails = new GetCarDetails(mockCarRepository, mockThreadExecutor,
                mockPostExecutionThread);
    }

    @Test
    public void testGetCarDetailsUseCaseObservablePassCase() {
        mGetCarDetails.buildUseCaseObservable(Params.forCar(CAR_ID));

        verify(mockCarRepository).car(CAR_ID);
        verifyNoMoreInteractions(mockCarRepository);
        verifyZeroInteractions(mockPostExecutionThread);
        verifyZeroInteractions(mockThreadExecutor);
    }

    @Test
    public void testShouldFailWhenNoOrEmptyParameters() {
        mExpectedException.expect(NullPointerException.class);
        mGetCarDetails.buildUseCaseObservable(null);
    }
}

