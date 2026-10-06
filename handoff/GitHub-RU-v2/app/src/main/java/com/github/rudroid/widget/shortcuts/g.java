package com.github.rudroid.widget.shortcuts;

import com.github.domain.shortcuts.model.StoredShortcutModel;
import rm0.r3Shadow;
import y71.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public static final a Companion = new a();
    public n5.f a;
    public um.r b;
    public oa.m c;

    public static final class a {
    }

    public interface b {
        g a();
    }

    public g(n5.f fVar, um.r rVar, oa.m mVar) {
        k71.k.g(fVar, "dataStore");
        k71.k.g(rVar, "shortcutsRepository");
        k71.k.g(mVar, "userManager");
        this.a = fVar;
        this.b = rVar;
        this.c = mVar;
    }

    public static String b(z5.k kVar) {
        return "shortcut_widget_shortcut_id_" + kVar;
    }

    public static String c(z5.k kVar) {
        return "shortcut_widget_user_" + kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(z5.k kVar, c71.c cVar) {
        j jVar;
        int i;
        s5.e Q;
        s5.e q;
        s5.e eVar;
        s5.b bVar;
        float floatValue;
        oa.j jVar2;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i2 = jVar.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.B = i2 - Integer.MIN_VALUE;
                Object obj = jVar.z;
                b71.a aVar = b71.a.r;
                i = jVar.B;
                if (i != 0) {
                    sy.y.j(obj);
                    s5.e Q2 = b91.g.Q(c(kVar));
                    Q = b91.g.Q(b(kVar));
                    q = b91.g.q("preference_key_selected_shortcut_opacity" + kVar);
                    y71.i data = this.a.getData();
                    jVar.u = Q2;
                    jVar.v = Q;
                    jVar.w = q;
                    jVar.B = 1;
                    Object v = n1.v(data, jVar);
                    if (v != aVar) {
                        eVar = Q2;
                        obj = v;
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    floatValue = jVar.y;
                    jVar2 = jVar.x;
                    sy.y.j(obj);
                    return new r(jVar2, (StoredShortcutModel) obj, floatValue);
                }
                q = jVar.w;
                Q = jVar.v;
                eVar = jVar.u;
                sy.y.j(obj);
                bVar = (s5.b) obj;
                if (bVar != null) {
                    String str = (String) bVar.d(eVar);
                    oa.j h = str != null ? this.c.h(str) : null;
                    Object d = bVar.d(Q);
                    Float f = (Float) bVar.d(q);
                    String str2 = (String) d;
                    floatValue = new Float(f != null ? f.floatValue() : 0.0f).floatValue();
                    if (h != null && str2 != null) {
                        r3Shadow b2 = this.b.b(h, str2);
                        jVar.u = null;
                        jVar.v = null;
                        jVar.w = null;
                        jVar.x = h;
                        jVar.y = floatValue;
                        jVar.B = 2;
                        obj = n1.v(b2, jVar);
                        if (obj != aVar) {
                            jVar2 = h;
                            return new r(jVar2, (StoredShortcutModel) obj, floatValue);
                        }
                        return aVar;
                    }
                }
                return null;
            }
        }
        jVar = new j(this, cVar);
        Object obj2 = jVar.z;
        b71.a aVar2 = b71.a.r;
        i = jVar.B;
        if (i != 0) {
        }
        bVar = (s5.b) obj2;
        if (bVar != null) {
        }
        return null;
    }
}
