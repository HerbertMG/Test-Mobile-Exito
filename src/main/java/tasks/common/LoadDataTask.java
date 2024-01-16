package tasks.common;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;
import utils.ExitoData;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class LoadDataTask implements Task {
    private final Map<String, String> testData;

    public LoadDataTask(Map<String, String> testData) {
        this.testData = testData;
    }

    @Override
    @Step("Data uploaded!")
    public <T extends Actor> void performAs(T actor) {
        Set<Map.Entry<String, String>> testDataAux = testData.entrySet();
        ExitoData.setData(testDataAux.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
    }

    public static LoadDataTask informationExito(Map<String, String> testData) {
        return Tasks.instrumented(LoadDataTask.class, testData);
    }
}