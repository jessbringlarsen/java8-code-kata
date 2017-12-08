package date.and.time.api.othertypes;

import common.test.tool.dataset.DateAndTimes;
import org.junit.Test;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class OffsetDateTimeExplorationTest {

    @Test
    public void offsetDateTime() {
        ZoneOffset offset = ZoneOffset.of("+1");
        OffsetDateTime offsetDateTime = OffsetDateTime.of(DateAndTimes.LDT_20150618_23073050, offset);

        assertThat(offsetDateTime.toString(), is("2015-06-18T23:07:30.500+01:00"));
    }
}
