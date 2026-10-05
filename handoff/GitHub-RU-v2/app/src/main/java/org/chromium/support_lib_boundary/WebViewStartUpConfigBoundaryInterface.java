package org.chromium.support_lib_boundary;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: /home/user/work/p/classes5.dex */
public interface WebViewStartUpConfigBoundaryInterface {
    Executor getBackgroundExecutor();

    Set<String> getProfileNamesToLoad();

    boolean shouldRunUiThreadStartUpTasks();
}
