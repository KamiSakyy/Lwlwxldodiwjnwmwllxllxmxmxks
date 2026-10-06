package com.github.rudroid.actions.navigation;

import g81.e;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import sa.c;
import x.i;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class CheckDetailEntryPointRoute implements c {
    public static final Companion Companion = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public String f5106a;

    /* renamed from: b, reason: collision with root package name */
    public String f5107b;

    public static final class Companion {
        public final KSerializer serializer() {
            return CheckDetailEntryPointRoute$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CheckDetailEntryPointRoute(String str, int i, String str2) {
        if (3 != (i & 3)) {
            c1Shadow.l(i, 3, CheckDetailEntryPointRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f5106a = str;
        this.f5107b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckDetailEntryPointRoute)) {
            return false;
        }
        CheckDetailEntryPointRoute checkDetailEntryPointRoute = (CheckDetailEntryPointRoute) obj;
        return k.b(this.f5106a, checkDetailEntryPointRoute.f5106a) && k.b(this.f5107b, checkDetailEntryPointRoute.f5107b);
    }

    public final int hashCode() {
        int hashCode = this.f5106a.hashCode() * 31;
        String str = this.f5107b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return i.g("CheckDetailEntryPointRoute(checkRunId=", this.f5106a, ", pullRequestId=", this.f5107b, ")");
    }
}
