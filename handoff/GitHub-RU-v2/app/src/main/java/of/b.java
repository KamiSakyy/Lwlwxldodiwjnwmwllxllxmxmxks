package of;

import com.github.rudroid.utilities.ui.g1;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f30197a;

    /* renamed from: b, reason: collision with root package name */
    public final g1 f30198b;

    /* renamed from: c, reason: collision with root package name */
    public final g1 f30199c;

    public b(a aVar, g1 g1Var, g1 g1Var2) {
        k.g(aVar, "forkRepositoryFormData");
        k.g(g1Var, "forkingState");
        k.g(g1Var2, "repositoryUrlExistsState");
        this.f30197a = aVar;
        this.f30198b = g1Var;
        this.f30199c = g1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.f30197a, bVar.f30197a) && k.b(this.f30198b, bVar.f30198b) && k.b(this.f30199c, bVar.f30199c);
    }

    public final int hashCode() {
        return this.f30199c.hashCode() + ((this.f30198b.hashCode() + (this.f30197a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ForkRepositoryUiModel(forkRepositoryFormData=" + this.f30197a + ", forkingState=" + this.f30198b + ", repositoryUrlExistsState=" + this.f30199c + ")";
    }
}
