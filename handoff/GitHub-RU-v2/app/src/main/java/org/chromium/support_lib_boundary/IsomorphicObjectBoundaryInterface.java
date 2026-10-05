package org.chromium.support_lib_boundary;

import java.util.concurrent.Callable;

/* loaded from: /home/user/work/p/classes5.dex */
public interface IsomorphicObjectBoundaryInterface {
    Object getOrCreatePeer(Callable<Object> callable);
}
