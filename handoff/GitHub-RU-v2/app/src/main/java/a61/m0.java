package a61;

import com.github.service.models.response.GitObjectType;
import java.util.Iterator;
import java.util.List;
import yz0.r1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m0 extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(String str, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.x = str;
    }

    @Override // c71.a
    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                m0 m0Var = new m0(this.x, cVar, 0);
                m0Var.w = obj;
                return m0Var;
            default:
                m0 m0Var2 = new m0(this.x, cVar, 1);
                m0Var2.w = obj;
                return m0Var2;
        }
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        switch (this.v) {
            case 0:
                m0 m0Var = (m0) r((a71.c) obj2, (s5.b) obj);
                w61.a0 a0Var = w61.a0.a;
                m0Var.v(a0Var);
                return a0Var;
            default:
                return ((m0) r((a71.c) obj2, (List) obj)).v(w61.a0.a);
        }
    }

    @Override // c71.a
    public final Object v(Object obj) {
        Object obj2;
        Object obj3;
        GitObjectType gitObjectType;
        String str;
        String str2;
        String str3;
        int i = this.v;
        String str4 = this.x;
        switch (i) {
            case 0:
                b71.a aVar = b71.a.r;
                sy.y.j(obj);
                s5.b bVar = (s5.b) this.w;
                s5.e eVar = h0.a;
                bVar.f(h0.a, str4);
                return w61.a0.a;
            default:
                List list = (List) this.w;
                b71.a aVar2 = b71.a.r;
                sy.y.j(obj);
                Iterator it = list.iterator();
                while (true) {
                    obj2 = null;
                    if (it.hasNext()) {
                        obj3 = it.next();
                        GitObjectType gitObjectType2 = ((r1) obj3).a;
                        if (gitObjectType2 != GitObjectType.BLOB && gitObjectType2 != GitObjectType.TREE) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                r1 r1Var = (r1) obj3;
                if (r1Var == null) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (((r1) next).a != GitObjectType.UNKNOWN__) {
                                obj2 = next;
                            }
                        }
                    }
                    r1Var = (r1) obj2;
                    if (r1Var == null) {
                        r1Var = (r1) x61.m.f0(list);
                    }
                }
                if (r1Var == null || (gitObjectType = r1Var.a) == null) {
                    gitObjectType = GitObjectType.UNKNOWN__;
                }
                return new r1(gitObjectType, (r1Var == null || (str3 = r1Var.b) == null) ? "" : str3, (r1Var == null || (str2 = r1Var.c) == null) ? str4 : str2, (r1Var == null || (str = r1Var.d) == null) ? "" : str, r1Var != null ? r1Var.e : false);
        }
    }
}
