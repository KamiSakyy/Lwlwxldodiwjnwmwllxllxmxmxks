package fa1;

import androidx.lifecycle.l1;
import com.google.android.gms.internal.measurement.i4;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: /home/user/work/p/classes5.dex */
public final class n0 {
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public String a;
    public q81.o b;
    public String c;
    public l7.e d;
    public final l1 e = new l1(11);
    public ia.d f;
    public q81.q g;
    public boolean h;
    public l51.h i;
    public q81.k j;
    public q81.y k;

    public n0(String str, q81.o oVar, String str2, q81.n nVar, q81.q qVar, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = oVar;
        this.c = str2;
        this.g = qVar;
        this.h = z;
        if (nVar != null) {
            this.f = nVar.d();
        } else {
            this.f = new ia.d(4);
        }
        if (z2) {
            this.j = new q81.k(0);
        } else if (z3) {
            l51.h hVar = new l51.h(10);
            this.i = hVar;
            hVar.K(q81.s.f);
        }
    }

    public final void a(String str, String str2, boolean z) {
        q81.k kVar = this.j;
        if (!z) {
            kVar.a(str, str2);
            return;
        }
        kVar.getClass();
        k71.k.g(str, "name");
        kVar.a.add(f91.a.b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
        kVar.b.add(f91.a.b(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
    }

    public final void b(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                t71.n nVar = q81.q.d;
                this.g = i4.V(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(f1.e.g("Malformed content type: ", str2), e);
            }
        }
        ia.d dVar = this.f;
        if (z) {
            dVar.d(str, str2);
        } else {
            dVar.a(str, str2);
        }
    }

    public final void c(q81.n nVar, q81.y yVar) {
        l51.h hVar = this.i;
        hVar.getClass();
        k71.k.g(yVar, "body");
        if (nVar.a("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (nVar.a("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        ((ArrayList) hVar.u).add(new q81.r(nVar, yVar));
    }

    public final void d(String str, String str2, boolean z) {
        String str3 = this.c;
        if (str3 != null) {
            q81.o oVar = this.b;
            l7.e f = oVar.f(str3);
            this.d = f;
            if (f == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + oVar + ", Relative: " + this.c);
            }
            this.c = null;
        }
        if (z) {
            l7.e eVar = this.d;
            eVar.getClass();
            k71.k.g(str, "encodedName");
            if (((ArrayList) eVar.d) == null) {
                eVar.d = new ArrayList();
            }
            ArrayList arrayList = (ArrayList) eVar.d;
            k71.k.d(arrayList);
            arrayList.add(f91.a.a(str, 0, 0, " \"'<>#&=", 83));
            ArrayList arrayList2 = (ArrayList) eVar.d;
            k71.k.d(arrayList2);
            arrayList2.add(str2 != null ? f91.a.a(str2, 0, 0, " \"'<>#&=", 83) : null);
            return;
        }
        l7.e eVar2 = this.d;
        eVar2.getClass();
        k71.k.g(str, "name");
        if (((ArrayList) eVar2.d) == null) {
            eVar2.d = new ArrayList();
        }
        ArrayList arrayList3 = (ArrayList) eVar2.d;
        k71.k.d(arrayList3);
        arrayList3.add(f91.a.a(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91));
        ArrayList arrayList4 = (ArrayList) eVar2.d;
        k71.k.d(arrayList4);
        arrayList4.add(str2 != null ? f91.a.a(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91) : null);
    }

}
