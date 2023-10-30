package racingcar.view;

import racingcar.dto.RaceResult;

import java.util.List;

public class OutputView {

    private static final String ONE_STEP = "-";
    private static final String PRINT_RACE_RESULT_MESSAGE = "실행 결과";

    public static void printRaceResult(List<RaceResult> raceResults) {
        System.out.println();
        System.out.println(PRINT_RACE_RESULT_MESSAGE);
        raceResults.forEach(OutputView::printRaceStatus);
    }

    private static void printRaceStatus(RaceResult raceResult) {
        raceResult.carStatuses().forEach(carStatus -> {
            String carMovementVisualString = createCarMovementVisualString(carStatus.position());
            System.out.println(carStatus.carName() + " : " + carMovementVisualString);
        });
        System.out.println();
    }

    private static String createCarMovementVisualString(int carPosition) {
        return ONE_STEP.repeat(carPosition);
    }
}
