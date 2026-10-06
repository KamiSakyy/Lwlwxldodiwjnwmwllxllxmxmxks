package b21;

import android.content.Context;
import androidx.compose.foundation.lazy.layout.u0;
import androidx.compose.runtime.l1;
import androidx.compose.runtime.m1;
import com.google.android.gms.measurement.internal.y0;
import java.util.List;
import java.util.Map;
import k71.x;
import k71.z;
import kotlinx.serialization.KSerializer;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l implements c21.d {
    public boolean r;
    public final Object s;
    public final Object t;
    public final Object u;
    public Object v;
    public final Object w;

    public l(d dVar, a21.a aVar, a aVar2) {
        this.w = dVar;
        this.u = null;
        this.v = null;
        this.r = false;
        this.s = aVar;
        this.t = aVar2;
    }

    public KSerializer a(r71.b bVar, List list) {
        return null;
    }

    public KSerializer b(r71.b bVar, Object obj) {
        k71.k.g(bVar, "baseClass");
        k71.k.g(obj, "value");
        if (((k71.e) bVar).d(obj)) {
            Map map = (Map) ((Map) this.t).get(bVar);
            KSerializer kSerializer = map != null ? (KSerializer) map.get(x.a(obj.getClass())) : null;
            KSerializer kSerializer2 = kSerializer instanceof KSerializer ? kSerializer : null;
            if (kSerializer2 != null) {
                return kSerializer2;
            }
            Object obj2 = ((Map) this.u).get(bVar);
            j71.c cVar = z.e(1, obj2) ? (j71.c) obj2 : null;
            if (cVar != null) {
                return (KSerializer) cVar.k(obj);
            }
        }
        return null;
    }

    public void c(z11.b bVar) {
        j jVar = (j) ((d) this.w).A.get((a) this.t);
        if (jVar != null) {
            c21.u.c(jVar.p.D);
            a21.a aVar = jVar.g;
            aVar.b("onSignInFailed for " + aVar.getClass().getName() + " with " + String.valueOf(bVar));
            jVar.o(bVar, null);
        }
    }

    @Override // c21.d
    public void d(z11.b bVar) {
        ((d) this.w).D.post(new com.google.common.util.concurrent.b(this, bVar, false, 2));
    }

    public l(Context context, x9.o oVar, v2.t tVar) {
        this.s = context;
        this.t = oVar;
        this.u = tVar;
        this.v = new y0(this, true);
        this.w = new y0(this, false);
    }

    public l(Map map, Map map2, Map map3, Map map4, Map map5, boolean z) {
        k71.k.g(map, "class2ContextualFactory");
        k71.k.g(map2, "polyBase2Serializers");
        k71.k.g(map3, "polyBase2DefaultSerializerProvider");
        k71.k.g(map4, "polyBase2NamedSerializers");
        k71.k.g(map5, "polyBase2DefaultDeserializerProvider");
        this.s = map;
        this.t = map2;
        this.u = map3;
        this.v = map4;
        this.w = map5;
        this.r = z;
    }

    public l(int i, float f, o0.x xVar) {
        this.s = xVar;
        this.t = new m1(i);
        this.u = new l1(f);
        this.w = new u0(i, 30, 100);
    }
}
