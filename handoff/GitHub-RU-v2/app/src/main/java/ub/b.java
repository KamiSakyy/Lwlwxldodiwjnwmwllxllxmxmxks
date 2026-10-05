package ub;

import kotlin.NoWhenBranchMatchedException;
import ub.a;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {
    public static final boolean a(a aVar, boolean z10) {
        if (aVar instanceof a.e) {
            return false;
        }
        if (aVar instanceof a.d) {
            return true;
        }
        if (aVar instanceof a.c) {
            return false;
        }
        if (aVar instanceof a.C0092a) {
            return z10;
        }
        throw new NoWhenBranchMatchedException();
    }
}
