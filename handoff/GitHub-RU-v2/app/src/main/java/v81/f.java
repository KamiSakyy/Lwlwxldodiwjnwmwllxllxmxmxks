package v81;

import h91.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import q81.a0;
import q81.j;
import q81.n;
import q81.o;
import t71.p;
import t71.w;
import x61.r;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class f {
    static {
        k kVar = k.u;
        c30.d.b("\"\\");
        c30.d.b("\t ,=");
    }

    public static final boolean a(a0 a0Var) {
        if (k71.k.b((String) a0Var.r.c, "HEAD")) {
            return false;
        }
        int i = a0Var.u;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || r81.g.e(a0Var) != -1) {
            return true;
        }
        String a = a0Var.w.a("Transfer-Encoding");
        if (a == null) {
            a = null;
        }
        return "chunked".equalsIgnoreCase(a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x01f0, code lost:
    
        if (r81.d.a.e(r0) == false) goto L112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(q81.b bVar, o oVar, n nVar) {
        int i;
        List list;
        List list2;
        List list3;
        j jVar;
        int i2;
        j jVar2;
        k71.k.g(bVar, "<this>");
        k71.k.g(oVar, "url");
        k71.k.g(nVar, "headers");
        if (bVar == q81.b.c) {
            return;
        }
        Pattern pattern = j.k;
        int size = nVar.size();
        int i3 = 0;
        int i4 = 0;
        ArrayList arrayList = null;
        while (true) {
            i = 2;
            if (i4 >= size) {
                break;
            }
            if ("Set-Cookie".equalsIgnoreCase(nVar.b(i4))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(nVar.e(i4));
            }
            i4++;
        }
        if (arrayList != null) {
            list = Collections.unmodifiableList(arrayList);
            k71.k.f(list, "unmodifiableList(...)");
        } else {
            list = null;
        }
        List list4 = r.r;
        List list5 = list == null ? list4 : list;
        int size2 = list5.size();
        int i5 = 0;
        ArrayList arrayList2 = null;
        while (i5 < size2) {
            String str = (String) list5.get(i5);
            k71.k.g(str, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            char c = ';';
            int e = r81.e.e(str, ';', i3, i3, 6);
            char c2 = '=';
            int e2 = r81.e.e(str, '=', i3, e, i);
            if (e2 != e) {
                String o = r81.e.o(i3, str, e2);
                if (o.length() != 0 && r81.e.g(o) == -1) {
                    String o2 = r81.e.o(e2 + 1, str, e);
                    if (r81.e.g(o2) == -1) {
                        int i6 = e + 1;
                        int length = str.length();
                        long j = 253402300799999L;
                        long j2 = 253402300799999L;
                        String str2 = null;
                        String str3 = null;
                        boolean z = false;
                        long j3 = -1;
                        boolean z2 = true;
                        boolean z3 = false;
                        String str4 = null;
                        boolean z4 = false;
                        while (true) {
                            if (i6 < length) {
                                List list6 = list4;
                                int d = r81.e.d(str, c, i6, length);
                                int d2 = r81.e.d(str, c2, i6, d);
                                String o3 = r81.e.o(i6, str, d2);
                                String o4 = d2 < d ? r81.e.o(d2 + 1, str, d) : "";
                                if (o3.equalsIgnoreCase("expires")) {
                                    try {
                                        j2 = b91.g.G(o4, o4.length());
                                        z3 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                    i6 = d + 1;
                                    list4 = list6;
                                    c2 = '=';
                                    c = ';';
                                } else if (o3.equalsIgnoreCase("max-age")) {
                                    try {
                                        j3 = Long.parseLong(o4);
                                        if (j3 <= 0) {
                                            j3 = Long.MIN_VALUE;
                                        }
                                    } catch (NumberFormatException e3) {
                                        Pattern compile = Pattern.compile("-?\\d+");
                                        k71.k.f(compile, "compile(...)");
                                        if (!compile.matcher(o4).matches()) {
                                            throw e3;
                                        }
                                        j3 = w.F(o4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    z3 = true;
                                    i6 = d + 1;
                                    list4 = list6;
                                    c2 = '=';
                                    c = ';';
                                } else {
                                    if (o3.equalsIgnoreCase("domain")) {
                                        if (w.x(o4, ".", false)) {
                                            throw new IllegalArgumentException("Failed requirement.");
                                        }
                                        String b = r81.d.b(p.a0(o4, "."));
                                        if (b == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        str2 = b;
                                        z2 = false;
                                    } else if (o3.equalsIgnoreCase("path")) {
                                        str3 = o4;
                                    } else if (o3.equalsIgnoreCase("secure")) {
                                        z4 = true;
                                    } else if (o3.equalsIgnoreCase("httponly")) {
                                        z = true;
                                    } else if (o3.equalsIgnoreCase("samesite")) {
                                        str4 = o4;
                                    }
                                    i6 = d + 1;
                                    list4 = list6;
                                    c2 = '=';
                                    c = ';';
                                }
                            } else {
                                list3 = list4;
                                if (j3 == Long.MIN_VALUE) {
                                    j = Long.MIN_VALUE;
                                } else if (j3 != -1) {
                                    long j4 = currentTimeMillis + (j3 <= 9223372036854775L ? j3 * 1000 : Long.MAX_VALUE);
                                    if (j4 >= currentTimeMillis && j4 <= 253402300799999L) {
                                        j = j4;
                                    }
                                } else {
                                    j = j2;
                                }
                                String str5 = oVar.d;
                                if (str2 == null) {
                                    str2 = str5;
                                } else if (!k71.k.b(str5, str2)) {
                                    if (w.x(str5, str2, false) && str5.charAt((str5.length() - str2.length()) - 1) == '.') {
                                        t71.n nVar2 = r81.d.a;
                                    }
                                    i2 = 0;
                                    jVar2 = null;
                                    jVar = jVar2;
                                }
                                if (str5.length() == str2.length() || d91.a.d.a(str2) != null) {
                                    String str6 = "/";
                                    i2 = 0;
                                    if (str3 == null || !w.F(str3, "/", false)) {
                                        String b2 = oVar.b();
                                        int W = p.W(b2, '/', 0, 6);
                                        if (W != 0) {
                                            str6 = b2.substring(0, W);
                                            k71.k.f(str6, "substring(...)");
                                        }
                                        str3 = str6;
                                    }
                                    jVar2 = new j(o, o2, j, str2, str3, z4, z, z3, z2, str4);
                                    jVar = jVar2;
                                }
                                i2 = 0;
                                jVar2 = null;
                                jVar = jVar2;
                            }
                        }
                    }
                }
            }
            list3 = list4;
            jVar = null;
            i2 = 0;
            if (jVar != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(jVar);
            }
            i5++;
            i3 = i2;
            list4 = list3;
            i = 2;
        }
        List list7 = list4;
        if (arrayList2 != null) {
            list2 = Collections.unmodifiableList(arrayList2);
            k71.k.f(list2, "unmodifiableList(...)");
        } else {
            list2 = null;
        }
        (list2 == null ? list7 : list2).isEmpty();
    }

    public static Object b;
}
