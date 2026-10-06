package com.github.service.copilot;

import g81.e;
import java.util.Map;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;
import wm.a;
import xn.c4;
import xn.g1;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class SteerCommand$ElicitationResponse implements c4 {
    public static final Companion Companion = new Companion();
    public static final h[] d;
    public String a;
    public g1 b;
    public Map c;

    public static final class Companion {
        public final KSerializer serializer() {
            return SteerCommand$ElicitationResponse$$serializer.INSTANCE;
        }
    }

    static {
        i iVar = i.r;
        d = new h[]{null, w.s(iVar, new a(18)), w.s(iVar, new a(19))};
    }

    public /* synthetic */ SteerCommand$ElicitationResponse(int i, String str, g1 g1Var, Map map) {
        if (3 != (i & 3)) {
            c1.l(i, 3, SteerCommand$ElicitationResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = g1Var;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SteerCommand$ElicitationResponse)) {
            return false;
        }
        SteerCommand$ElicitationResponse steerCommand$ElicitationResponse = (SteerCommand$ElicitationResponse) obj;
        return k.b(this.a, steerCommand$ElicitationResponse.a) && this.b == steerCommand$ElicitationResponse.b && k.b(this.c, steerCommand$ElicitationResponse.c);
    }

    @Override // xn.c4
    public final String getType() {
        return "elicitation_response";
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Map map = this.c;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "ElicitationResponse(promptId=" + this.a + ", action=" + this.b + ", content=" + this.c + ")";
    }

    public SteerCommand$ElicitationResponse(String str, g1 g1Var, Map map) {
        this.a = str;
        this.b = g1Var;
        this.c = map;
    }
}
