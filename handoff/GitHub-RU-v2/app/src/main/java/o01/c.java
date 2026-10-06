package o01;

import com.github.rudroid.common.b0;
import com.github.service.models.response.Avatar;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import x01.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public a a;
    public Avatar b;
    public b0 c;
    public List d;
    public i e;

    public c(a aVar, Avatar avatar, b0 b0Var, List list, i iVar) {
        this.a = aVar;
        this.b = avatar;
        this.c = b0Var;
        this.d = list;
        this.e = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    public static c a(c cVar, a aVar, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            aVar = cVar.a;
        }
        a aVar2 = aVar;
        Avatar avatar = cVar.b;
        b0 b0Var = cVar.c;
        ArrayList arrayList2 = arrayList;
        if ((i & 8) != 0) {
            arrayList2 = cVar.d;
        }
        i iVar = cVar.e;
        cVar.getClass();
        return new c(aVar2, avatar, b0Var, arrayList2, iVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && k.b(this.b, cVar.b) && k.b(this.c, cVar.c) && k.b(this.d, cVar.d) && k.b(this.e, cVar.e);
    }

    public final int hashCode() {
        a aVar = this.a;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        Avatar avatar = this.b;
        return this.e.hashCode() + f1.e.c(this.d, (this.c.hashCode() + ((hashCode + (avatar != null ? avatar.hashCode() : 0)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "ReleaseDetails(releaseDetail=" + this.a + ", ownerAvatar=" + this.b + ", mentions=" + this.c + ", assets=" + this.d + ", page=" + this.e + ")";
    }
}
