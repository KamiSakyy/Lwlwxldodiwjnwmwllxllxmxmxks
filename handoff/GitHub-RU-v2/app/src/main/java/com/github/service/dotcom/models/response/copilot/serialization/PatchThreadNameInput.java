package com.github.service.dotcom.models.response.copilot.serialization;

import com.github.rudroid.copilot.h1;
import g81.e;
import k71.k;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class PatchThreadNameInput {
    public static final Companion Companion = new Companion();
    public final String a;
    public final boolean b;

    public static final class Companion {
        public final KSerializer serializer() {
            return PatchThreadNameInput$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PatchThreadNameInput(int i, String str, boolean z) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = true;
        } else {
            this.b = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatchThreadNameInput)) {
            return false;
        }
        PatchThreadNameInput patchThreadNameInput = (PatchThreadNameInput) obj;
        return k.b(this.a, patchThreadNameInput.a) && this.b == patchThreadNameInput.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h1.n("PatchThreadNameInput(name=", this.a, ", generate=", ")", this.b);
    }

    public PatchThreadNameInput(boolean z) {
        this.a = "";
        this.b = z;
    }
}
