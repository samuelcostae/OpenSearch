/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.identity.noop;

import org.opensearch.test.OpenSearchTestCase;
import org.opensearch.authn.Subject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class NoopSubjectTests extends OpenSearchTestCase {

    public void testAllNoopSubjectAreEquals() {
        assertThat(new NoopSubject(), equalTo(new NoopSubject()));
    }

    public void testHashCode() {
        final Subject s1 = new NoopSubject();
        final Subject s2 = new NoopSubject();
        assertThat(s1.hashCode(), equalTo(s2.hashCode()));
    }

    public void testToString() {
        final Subject s = new NoopSubject();
        assertThat(s.toString(), equalTo("NoopSubject(principal=StringPrincipal(name=Unauthenticated))"));
    }

}