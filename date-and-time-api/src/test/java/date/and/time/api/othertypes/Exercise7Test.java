package date.and.time.api.othertypes;

import common.test.tool.dataset.DateAndTimes;
import org.junit.Test;

import java.time.Duration;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Exercise7Test {

    @Test
    public void durationInSeconds() {
        Duration duration = Duration.of(2, ChronoUnit.SECONDS);

        assertThat(duration.getSeconds(), is(2L));
    }

    @Test
    public void addToLocalTime() {
        Duration duration = Duration.of(2, ChronoUnit.SECONDS);

        Temporal temporal = duration.addTo(DateAndTimes.LT_12100000);

        assertThat(temporal.get(ChronoField.SECOND_OF_MINUTE), is(2));
    }
}
