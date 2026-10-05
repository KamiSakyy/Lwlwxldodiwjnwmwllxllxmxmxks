package org.chromium.support_lib_boundary;

import java.util.List;

/* loaded from: /home/user/work/p/classes5.dex */
public interface NoVarySearchDataBoundaryInterface {
    List<String> getConsideredQueryParameters();

    boolean getIgnoreDifferencesInParameters();

    List<String> getIgnoredQueryParameters();

    boolean getVaryOnKeyOrder();
}
