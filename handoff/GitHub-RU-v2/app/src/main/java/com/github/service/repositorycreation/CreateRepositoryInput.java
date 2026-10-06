package com.github.service.repositorycreation;

import a0.s0;
import com.github.rudroid.m0;
import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import x.i;

@e
/* loaded from: /home/user/work/p/classes4.dex */
public final class CreateRepositoryInput {
    public static final Companion Companion = new Companion();
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;

    public static final class Companion {
        public final KSerializer serializer() {
            return CreateRepositoryInput$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreateRepositoryInput(int i, String str, String str2, boolean z, boolean z2, String str3, String str4) {
        if (1 != (i & 1)) {
            c1.l(i, 1, CreateRepositoryInput$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = true;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateRepositoryInput)) {
            return false;
        }
        CreateRepositoryInput createRepositoryInput = (CreateRepositoryInput) obj;
        return k.b(this.a, createRepositoryInput.a) && k.b(this.b, createRepositoryInput.b) && this.c == createRepositoryInput.c && this.d == createRepositoryInput.d && k.b(this.e, createRepositoryInput.e) && k.b(this.f, createRepositoryInput.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int e = i.e(i.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        String str2 = this.e;
        int hashCode2 = (e + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = s0.o("CreateRepositoryInput(name=", this.a, ", description=", this.b, ", private=");
        m0.A(o, this.c, ", autoInit=", this.d, ", gitignoreTemplate=");
        return i.k(o, this.e, ", licenseTemplate=", this.f, ")");
    }

    public CreateRepositoryInput(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = str3;
        this.f = str4;
    }
}
