package q5;

import android.content.Context;
import android.content.SharedPreferences;
import b6.j1;
import b6.n0;
import cn.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import k71.k;
import sy.w;
import sy.y;
import w61.p;
import x61.m;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f30976a;

    /* renamed from: b, reason: collision with root package name */
    public final r f30977b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f30978c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30979d;

    /* renamed from: e, reason: collision with root package name */
    public final p f30980e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f30981f;

    public b(Context context, String str, Set set, n0 n0Var, r rVar) {
        k.g(context, "context");
        k.g(str, "sharedPreferencesName");
        k.g(set, "keysToMigrate");
        j1 j1Var = new j1(3, context, str);
        this.f30976a = n0Var;
        this.f30977b = rVar;
        this.f30978c = context;
        this.f30979d = str;
        this.f30980e = w.t(j1Var);
        this.f30981f = set == c.f30982a ? null : m.J0(set);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if (r5.isEmpty() == false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, c71.c cVar) {
        a aVar;
        Object obj2;
        int i;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i10 = aVar.f30975w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f30975w = i10 - Integer.MIN_VALUE;
                obj2 = aVar.f30973u;
                b71.a aVar2 = b71.a.r;
                i = aVar.f30975w;
                boolean z10 = true;
                if (i != 0) {
                    y.j(obj2);
                    aVar.f30975w = 1;
                    obj2 = this.f30976a.s(obj, aVar);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    return Boolean.FALSE;
                }
                p pVar = this.f30980e;
                Set set = this.f30981f;
                if (set != null) {
                    Set set2 = set;
                    SharedPreferences sharedPreferences = (SharedPreferences) pVar.getValue();
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        Iterator it = set2.iterator();
                        while (it.hasNext()) {
                            if (sharedPreferences.contains((String) it.next())) {
                                break;
                            }
                        }
                    }
                    z10 = false;
                    return Boolean.valueOf(z10);
                }
                Map<String, ?> all = ((SharedPreferences) pVar.getValue()).getAll();
                k.f(all, "getAll(...)");
            }
        }
        aVar = new a(this, cVar);
        obj2 = aVar.f30973u;
        b71.a aVar22 = b71.a.r;
        i = aVar.f30975w;
        boolean z102 = true;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }
}
