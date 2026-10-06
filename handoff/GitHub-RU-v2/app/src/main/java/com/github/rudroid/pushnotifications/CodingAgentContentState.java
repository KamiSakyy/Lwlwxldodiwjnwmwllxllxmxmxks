package com.github.rudroid.pushnotifications;

import k81.c1;
import kotlinx.serialization.KSerializer;

@g81.e
/* loaded from: /home/user/work/p/classes.dex */
public final class CodingAgentContentState {
    public static final Companion Companion = new Companion();

    /* renamed from: b, reason: collision with root package name */
    public static final w61.h[] f18510b = {sy.w.s(w61.i.r, new com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.f(8))};

    /* renamed from: a, reason: collision with root package name */
    public SessionState f18511a;

    public static final class Companion {
        public final KSerializer serializer() {
            return CodingAgentContentState$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CodingAgentContentState(int i, SessionState sessionState) {
        if (1 == (i & 1)) {
            this.f18511a = sessionState;
        } else {
            c1.l(i, 1, CodingAgentContentState$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CodingAgentContentState) && this.f18511a == ((CodingAgentContentState) obj).f18511a;
    }

    public final int hashCode() {
        return this.f18511a.hashCode();
    }

    public final String toString() {
        return "CodingAgentContentState(sessionState=" + this.f18511a + ")";
    }
}
