package d51;

import androidx.compose.ui.layout.d0;
import h0.q1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import org.intellij.markdown.MarkdownParsingException;
import q71.g;
import sy.a0;
import v41.v;
import x61.l;
import x61.m;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f {
    public int a;
    public Object b;
    public Object c;
    public Serializable d;
    public Object e;
    public Serializable f;
    public Object g;
    public Object h;
    public Object i;

    public f(q1 q1Var, t91.c cVar) {
        k.g(cVar, "constraintsBase");
        k.g(cVar, "constraintsBase");
        this.b = q1Var;
        this.c = cVar;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = cVar;
        this.a = -1;
        this.f = new d0(1, this);
        this.g = new s91.f(cVar, cVar, arrayList);
        this.h = l.r(new u91.c[]{new p91.b(3), new p91.b(4), new w91.b(), new w91.e(), new p91.b(2), new p91.b(6), new p91.b(1), new w91.d(), new p91.b(5)});
        this.i = m.l0((List) this.h, sy.d0.n(new p91.b(0)));
    }

    public void a(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        if (i2 != 4) {
            for (int size = arrayList.size() - 1; size > i; size--) {
                if (!((u91.b) arrayList.get(size)).a(i2)) {
                    throw new MarkdownParsingException("If closing action is not NOTHING, marker should be gone");
                }
                arrayList.remove(size);
            }
            c();
        }
    }

    public void b(q1 q1Var, s91.c cVar, t91.d dVar) {
        k.g(dVar, "constraints");
        t91.c cVar2 = (t91.c) dVar;
        if (cVar2.g() == 0) {
            return;
        }
        int i = cVar.c;
        int min = Math.min(a0.l(dVar, cVar.d) + (i - cVar.b), cVar.d());
        Character S = l.S(cVar2.b);
        q1Var.a(sy.d0.n(new x91.e(new g(i, min, 1), (S != null && S.charValue() == '>') ? j91.a.G : ((S != null && S.charValue() == '.') || (S != null && S.charValue() == ')')) ? j91.a.g0 : j91.a.d0)));
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.d;
        this.e = arrayList.isEmpty() ? (t91.d) this.c : ((u91.b) m.e0(arrayList)).a;
    }

    public f(String str, String str2, String str3, String str4, v vVar, String str5, String str6, String str7, int i) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.i = vVar;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.a = i;
    }
}
