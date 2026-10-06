package pf;

import com.github.rudroid.utilities.ui.g1;
import java.util.ArrayList;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f30537a;

    /* renamed from: b, reason: collision with root package name */
    public g1 f30538b;

    public a(ArrayList arrayList, g1 g1Var) {
        k.g(g1Var, "updateIssueIssueTypeStateEvent");
        this.f30537a = arrayList;
        this.f30538b = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f30537a.equals(aVar.f30537a) && k.b(this.f30538b, aVar.f30538b);
    }

    public final int hashCode() {
        return this.f30538b.hashCode() + (this.f30537a.hashCode() * 31);
    }

    public final String toString() {
        return "RepositoryIssueTypesUiModel(selectableIssueTypes=" + this.f30537a + ", updateIssueIssueTypeStateEvent=" + this.f30538b + ")";
    }
}
