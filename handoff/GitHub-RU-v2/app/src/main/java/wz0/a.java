package wz0;

import ca1.j;
import java.util.Arrays;
import java.util.LinkedHashSet;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a extends b {
    public final /* synthetic */ int a;

    @Override // wz0.b
    public final void a(j jVar) {
        switch (this.a) {
            case 0:
                super.a(jVar);
                if (k.b(jVar.u.t, "span")) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(j.y.split(jVar.b("class").trim())));
                    linkedHashSet.remove("");
                    if (linkedHashSet.contains("x")) {
                        jVar.J("ghxa");
                        break;
                    }
                }
                break;
            default:
                super.a(jVar);
                if (k.b(jVar.u.t, "span")) {
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(Arrays.asList(j.y.split(jVar.b("class").trim())));
                    linkedHashSet2.remove("");
                    if (linkedHashSet2.contains("x")) {
                        jVar.J("ghxd");
                        break;
                    }
                }
                break;
        }
    }
}
