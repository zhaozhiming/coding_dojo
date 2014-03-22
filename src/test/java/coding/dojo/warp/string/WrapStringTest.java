package coding.dojo.warp.string;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class WrapStringTest {

    @Test
    public void should_return_2_line_when_given_word_word_and_4_length() throws Exception {
        String result = WrapString.wrap("word word", 4);
        assertThat(result, is("word\nword"));
    }

    @Test
    public void should_return_3_line_when_given_words_word_and_4_length() throws Exception {
        String result = WrapString.wrap("words word", 4);
        assertThat(result, is("word\ns\nword"));
    }

    @Test
    public void should_return_4_line_when_given_words_words_and_4_length() throws Exception {
        String result = WrapString.wrap("words words", 4);
        assertThat(result, is("word\ns\nword\ns"));
    }

    @Test
    public void should_return_4_line_when_given_words_words_and_3_length() throws Exception {
        String result = WrapString.wrap("words words", 3);
        assertThat(result, is("wor\nds\nwor\nds"));
    }

    @Test
    public void should_return_4_line_when_given_wordstring_word_and_4_length() throws Exception {
        String result = WrapString.wrap("wordstring word", 4);
        assertThat(result, is("word\nstri\nng\nword"));
    }
}
