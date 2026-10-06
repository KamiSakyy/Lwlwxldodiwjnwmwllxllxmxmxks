package of;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import f1.e;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f30191a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30192b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30193c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30194d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30195e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f30196f;

    public a(String str, String str2, String str3, String str4, String str5, boolean z10) {
        this.f30191a = str;
        this.f30192b = str2;
        this.f30193c = str3;
        this.f30194d = str4;
        this.f30195e = str5;
        this.f30196f = z10;
    }

    public static a a(a aVar, String str, boolean z10, int i) {
        String str2 = aVar.f30191a;
        String str3 = aVar.f30192b;
        String str4 = aVar.f30193c;
        if ((i & 8) != 0) {
            str = aVar.f30194d;
        }
        String str5 = str;
        String str6 = aVar.f30195e;
        if ((i & 32) != 0) {
            z10 = aVar.f30196f;
        }
        aVar.getClass();
        k.g(str5, "repositoryName");
        return new a(str2, str3, str4, str5, str6, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.f30191a, aVar.f30191a) && k.b(this.f30192b, aVar.f30192b) && k.b(this.f30193c, aVar.f30193c) && k.b(this.f30194d, aVar.f30194d) && k.b(this.f30195e, aVar.f30195e) && this.f30196f == aVar.f30196f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30196f) + h1.i(h1.i(h1.i(h1.i(this.f30191a.hashCode() * 31, this.f30192b, 31), this.f30193c, 31), this.f30194d, 31), this.f30195e, 31);
    }

    public final String toString() {
        StringBuilder o5 = s0.o("ForkRepositoryFormData(parentRepositoryOwner=", this.f30191a, ", parentRepositoryName=", this.f30192b, ", parentRepositoryDefaultBranchName=");
        e.x(o5, this.f30193c, ", repositoryName=", this.f30194d, ", repositoryDescription=");
        return m0.k(o5, this.f30195e, ", defaultBranchOnly=", this.f30196f, ")");
    }
}
