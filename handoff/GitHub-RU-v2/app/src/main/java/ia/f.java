package ia;

import androidx.compose.foundation.lazy.layout.s0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
import k71.k;
import x61.t;

/* loaded from: /home/user/work/p/classes.dex */
public final class f extends s0 {

    /* renamed from: t, reason: collision with root package name */
    public final LinkedHashMap f26158t;

    public f() {
        super(5, false);
        this.f26158t = new LinkedHashMap();
    }

    public final Set A(Collection collection, ha.a aVar) {
        k.g(collection, "records");
        k.g(aVar, "cacheHeaders");
        ha.e eVar = (ha.e) this.f1480s;
        return eVar != null ? eVar.C(collection, aVar) : t.r;
    }

    public final boolean B(ha.b bVar, boolean z10) {
        String str = bVar.f25576a;
        ha.e eVar = (ha.e) this.f1480s;
        boolean D = eVar != null ? eVar.D(bVar, z10) : false;
        LinkedHashMap linkedHashMap = this.f26158t;
        e eVar2 = (e) linkedHashMap.get(str);
        if (eVar2 != null) {
            linkedHashMap.remove(str);
            D = true;
            if (z10) {
                ArrayList c10 = eVar2.f26156a.c();
                int size = c10.size();
                boolean z11 = true;
                int i = 0;
                while (i < size) {
                    Object obj = c10.get(i);
                    i++;
                    z11 = z11 && B(new ha.b(((ha.b) obj).f25576a), true);
                }
                return z11;
            }
        }
        return D;
    }

    @Override // androidx.compose.foundation.lazy.layout.s0
    public final ha.f v(String str, ha.a aVar) {
        ha.f fVar;
        k.g(str, "key");
        k.g(aVar, "cacheHeaders");
        try {
            ha.e eVar = (ha.e) this.f1480s;
            ha.f v4 = eVar != null ? eVar.v(str, aVar) : null;
            e eVar2 = (e) this.f26158t.get(str);
            if (eVar2 == null) {
                return v4;
            }
            if (v4 != null && (fVar = (ha.f) v4.b(eVar2.f26156a).r) != null) {
                return fVar;
            }
            return eVar2.f26156a;
        } catch (Exception unused) {
            return null;
        }
    }

    public Object f1480s;
}
