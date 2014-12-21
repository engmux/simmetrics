package org.simmetrics;

import org.simmetrics.tokenisers.Tokenizer;

import uk.ac.shef.wit.simmetrics.simplifier.CachingSimplifier;

/**
 * Interface for metrics that use a {@link Tokenizer} to tokenize strings. These
 * methods can be called by batching-processing systems to inject a
 * {@link CachingSimplifier}s.
 * 
 * 
 * For the benefit of these caching systems, implementations should take care to
 * call the simplifier exactly once for each argument.
 * 
 * <pre>
 *  <code>
 * 	public ArrayList{@code<String>} tokenizeToList(String input) {
 * 		return tokenizer.tokenizeToList(input);
 * 	}
 * 
 * 	public Set{@code<String>} tokenizeToSet(String input) {
 * 		return tokenizer.tokenizeToSet(input);
 * 
 * 	}
 * </code>
 * </pre>
 * 
 * @see StringMetrics#compare(StringMetric, String, String...)
 * @see StringMetrics#compare(StringMetric, String, java.util.List)
 * 
 * @author mpkorstanje
 *
 */
public interface Tokenizing {
	/**
	 * Gets the tokenizer. The tokenizer may not be null.
	 * 
	 * @return the non-null tokenizer used
	 */

	public Tokenizer getTokenizer();

	/**
	 * Sets the tokenizer. The tokenizer may not be null.
	 * 
	 * @param tokenizer
	 *            a non-null tokenizer
	 */
	public void setTokenizer(Tokenizer tokenizer);

}
