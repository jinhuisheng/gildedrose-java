package com.gildedrose;

import com.google.common.io.Files;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static com.gildedrose.TextTestFixture.getBaseline;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GildedRoseSafetyNet {
    @Test
    public void should_always_align_with_baseline() throws IOException {
        String expected = Files.toString(new File("src/test/baseline.txt"), StandardCharsets.UTF_8);
        assertThat(getBaseline()).isEqualTo(expected);
    }
}
