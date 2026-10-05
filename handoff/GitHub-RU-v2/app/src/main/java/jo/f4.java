package jo;

import androidx.recyclerview.widget.RecyclerView;
import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class f4 {
    public static void A(String str, String str2, String str3, StringBuilder sb, ZonedDateTime zonedDateTime) {
        sb.append(zonedDateTime);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void B(String str, String str2, StringBuilder sb, ZonedDateTime zonedDateTime, boolean z) {
        sb.append(z);
        sb.append(str);
        sb.append(zonedDateTime);
        sb.append(str2);
    }

    public static void C(boolean z, aa.b bVar, ea.f fVar, aa.w wVar, String str) {
        bVar.b(fVar, wVar, Boolean.valueOf(z));
        fVar.z0(str);
    }

    public static int a(aa.u0 u0Var, int i, int i2) {
        return (u0Var.hashCode() + i) * i2;
    }

    public static int b(com.github.service.models.response.a aVar, int i, int i2) {
        return (aVar.hashCode() + i) * i2;
    }

    public static long c(int i, long j, String str) {
        String substring = String.valueOf(j).substring(i);
        k71.k.f(substring, str);
        return Long.parseLong(substring);
    }

    public static aa.k0 d(aa.b bVar) {
        return aa.c.d(aa.c.b(aa.c.a(bVar)));
    }

    public static aa.k0 e(ea.f fVar, String str, aa.b bVar) {
        fVar.z0(str);
        return aa.c.d(aa.c.b(aa.c.a(bVar)));
    }

    public static gl.f f(y71.y yVar) {
        return in.r.l(new y00.l(yVar, 10));
    }

    public static ClassCastException g(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String h(int i, int i2, String str, String str2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String i(int i, String str, String str2, String str3, List list) {
        return str + i + str2 + list + str3;
    }

    public static String j(aa.u0 u0Var, String str, String str2) {
        return str + u0Var + str2;
    }

    public static String k(aa.u0 u0Var, String str, String str2, String str3, String str4) {
        return str + str2 + str3 + u0Var + str4;
    }

    public static String l(aa1.b bVar, String str, String str2, String str3, String str4) {
        return str + str2 + str3 + bVar + str4;
    }

    public static String m(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.D());
        return sb.toString();
    }

    public static String n(String str, String str2, String str3, eq.c cVar, String str4) {
        return str + str2 + str3 + cVar + str4;
    }

    public static String o(String str, String str2, String str3, String str4, List list) {
        return str + str2 + str3 + list + str4;
    }

    public static String p(String str, String str2, String str3, ud0.a aVar, String str4) {
        return str + str2 + str3 + aVar + str4;
    }

    public static String q(StringBuilder sb, bl0.a aVar, String str) {
        sb.append(aVar);
        sb.append(str);
        return sb.toString();
    }

    public static String r(StringBuilder sb, vx.a aVar, String str) {
        sb.append(aVar);
        sb.append(str);
        return sb.toString();
    }

    public static String s(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder t(aa.u0 u0Var, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(u0Var);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder u(String str, aa1.b bVar, String str2, aa1.b bVar2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(bVar);
        sb.append(str2);
        sb.append(bVar2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder v(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static HashMap w(Class cls, l51.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static Map x(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void y(aa.o0 o0Var, ea.f fVar, aa.w wVar, aa.u0 u0Var, String str) {
        aa.c.d(o0Var).d(fVar, wVar, u0Var);
        fVar.z0(str);
    }

    public static /* synthetic */ void z(String str, int i) {
        if (i != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(k71.k.j(str));
        k71.k.l(nullPointerException, k71.k.class.getName());
        throw nullPointerException;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class RecyclerView<T1,T2,T3,T4> {
        public RecyclerView() {
        }
    }
}
