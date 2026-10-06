package com.github.service.copilot;

import a0.s0;
import com.github.rudroid.copilot.h1;
import g81.e;
import jo.f4;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import xn.c4;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class SteerCommand$AskUserResponse implements c4 {
    public static final Companion Companion = new Companion();
    public String a;
    public String b;
    public boolean c;

    public static final class Companion {
        public final KSerializer serializer() {
            return SteerCommand$AskUserResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SteerCommand$AskUserResponse(int i, String str, String str2, boolean z) {
        if (7 != (i & 7)) {
            c1.l(i, 7, SteerCommand$AskUserResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SteerCommand$AskUserResponse)) {
            return false;
        }
        SteerCommand$AskUserResponse steerCommand$AskUserResponse = (SteerCommand$AskUserResponse) obj;
        return k.b(this.a, steerCommand$AskUserResponse.a) && k.b(this.b, steerCommand$AskUserResponse.b) && this.c == steerCommand$AskUserResponse.c;
    }

    @Override // xn.c4
    public final String getType() {
        return "ask_user_response";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return f4.s(s0.o("AskUserResponse(promptId=", this.a, ", answer=", this.b, ", wasFreeform="), this.c, ")");
    }

    public SteerCommand$AskUserResponse(String str, String str2, boolean z) {
        k.g(str2, "answer");
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
