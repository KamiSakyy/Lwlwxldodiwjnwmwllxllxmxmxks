package com.github.service.dotcom.repository.model;

import com.github.rudroid.copilot.h1;
import g81.e;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ForkRepositoryInput {
    public static final Companion Companion = new Companion();
    public String a;
    public boolean b;

    public static final class Companion {
        public final KSerializer serializer() {
            return ForkRepositoryInput$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ForkRepositoryInput(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            c1Shadow.l(i, 3, ForkRepositoryInput$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForkRepositoryInput)) {
            return false;
        }
        ForkRepositoryInput forkRepositoryInput = (ForkRepositoryInput) obj;
        return k.b(this.a, forkRepositoryInput.a) && this.b == forkRepositoryInput.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h1.n("ForkRepositoryInput(name=", this.a, ", defaultBranchOnly=", ")", this.b);
    }

    public ForkRepositoryInput(String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
