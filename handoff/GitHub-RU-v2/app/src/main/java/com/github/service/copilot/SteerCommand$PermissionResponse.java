package com.github.service.copilot;

import com.github.rudroid.m0;
import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;
import wm.a;
import xn.c4;
import xn.z2;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class SteerCommand$PermissionResponse implements c4 {
    public static final Companion Companion = new Companion();
    public static final h[] d = {null, null, w.s(i.r, new a(20))};
    public String a;
    public boolean b;
    public z2 c;

    public static final class Companion {
        public final KSerializer serializer() {
            return SteerCommand$PermissionResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SteerCommand$PermissionResponse(int i, String str, boolean z, z2 z2Var) {
        if (7 != (i & 7)) {
            c1.l(i, 7, SteerCommand$PermissionResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z;
        this.c = z2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SteerCommand$PermissionResponse)) {
            return false;
        }
        SteerCommand$PermissionResponse steerCommand$PermissionResponse = (SteerCommand$PermissionResponse) obj;
        return k.b(this.a, steerCommand$PermissionResponse.a) && this.b == steerCommand$PermissionResponse.b && this.c == steerCommand$PermissionResponse.c;
    }

    @Override // xn.c4
    public final String getType() {
        return "permission_response";
    }

    public final int hashCode() {
        return this.c.hashCode() + x.i.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder o = m0.o("PermissionResponse(promptId=", this.a, ", approved=", ", scope=", this.b);
        o.append(this.c);
        o.append(")");
        return o.toString();
    }

    public SteerCommand$PermissionResponse(String str, boolean z, z2 z2Var) {
        k.g(z2Var, "scope");
        this.a = str;
        this.b = z;
        this.c = z2Var;
    }
}
