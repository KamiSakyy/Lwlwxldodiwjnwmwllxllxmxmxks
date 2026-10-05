package c4;

import a0.s0;
import androidx.constraintlayout.core.parser.CLParsingException;
import java.util.ArrayList;
import java.util.Objects;
import jo.f4;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class b extends c {

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f4104v;

    public b(char[] cArr) {
        super(cArr);
        this.f4104v = new ArrayList();
    }

    public final ArrayList A() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f4104v;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            c cVar = (c) obj;
            if (cVar instanceof d) {
                arrayList.add(((d) cVar).b());
            }
        }
        return arrayList;
    }

    public final void B(String str, c cVar) {
        ArrayList arrayList = this.f4104v;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            d dVar = (d) ((c) obj);
            if (dVar.b().equals(str)) {
                if (dVar.f4104v.size() > 0) {
                    dVar.f4104v.set(0, cVar);
                    return;
                } else {
                    dVar.f4104v.add(cVar);
                    return;
                }
            }
        }
        d dVar2 = new d(str.toCharArray());
        dVar2.f4106s = 0L;
        dVar2.i(str.length() - 1);
        if (dVar2.f4104v.size() > 0) {
            dVar2.f4104v.set(0, cVar);
        } else {
            dVar2.f4104v.add(cVar);
        }
        this.f4104v.add(dVar2);
    }

    @Override // c4.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f4104v.equals(((b) obj).f4104v);
        }
        return false;
    }

    @Override // c4.c
    public int hashCode() {
        return Objects.hash(this.f4104v, Integer.valueOf(super.hashCode()));
    }

    public final void j(c cVar) {
        this.f4104v.add(cVar);
    }

    @Override // c4.c
    /* renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public b clone() {
        b bVar = (b) super.clone();
        ArrayList arrayList = new ArrayList(this.f4104v.size());
        ArrayList arrayList2 = this.f4104v;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            c clone = ((c) obj).clone();
            clone.f4108u = bVar;
            arrayList.add(clone);
        }
        bVar.f4104v = arrayList;
        return bVar;
    }

    public final c l(int i) {
        if (i < 0 || i >= this.f4104v.size()) {
            throw new CLParsingException(no.a.k("no element at index ", i), this);
        }
        return (c) this.f4104v.get(i);
    }

    public final c n(String str) {
        ArrayList arrayList = this.f4104v;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            d dVar = (d) ((c) obj);
            if (dVar.b().equals(str)) {
                if (dVar.f4104v.size() > 0) {
                    return (c) dVar.f4104v.get(0);
                }
                return null;
            }
        }
        throw new CLParsingException(f1.e.z("no element for key <", str, ">"), this);
    }

    public final float o(int i) {
        c l = l(i);
        if (l != null) {
            return l.d();
        }
        throw new CLParsingException(no.a.k("no float at index ", i), this);
    }

    public final float p(String str) {
        c n10 = n(str);
        if (n10 != null) {
            return n10.d();
        }
        StringBuilder v4 = f4.v("no float found for key <", str, ">, found [");
        v4.append(n10.g());
        v4.append("] : ");
        v4.append(n10);
        throw new CLParsingException(v4.toString(), this);
    }

    public final int q(int i) {
        c l = l(i);
        if (l != null) {
            return l.e();
        }
        throw new CLParsingException(no.a.k("no int at index ", i), this);
    }

    public final c s(int i) {
        if (i < 0 || i >= this.f4104v.size()) {
            return null;
        }
        return (c) this.f4104v.get(i);
    }

    @Override // c4.c
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = this.f4104v;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            c cVar = (c) obj;
            if (sb2.length() > 0) {
                sb2.append("; ");
            }
            sb2.append(cVar);
        }
        return super.toString() + " = <" + ((Object) sb2) + " >";
    }

    public final c u(String str) {
        ArrayList arrayList = this.f4104v;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            d dVar = (d) ((c) obj);
            if (dVar.b().equals(str)) {
                if (dVar.f4104v.size() > 0) {
                    return (c) dVar.f4104v.get(0);
                }
            }
        }
        return null;
    }

    public final String v(int i) {
        c l = l(i);
        if (l instanceof h) {
            return l.b();
        }
        throw new CLParsingException(no.a.k("no string at index ", i), this);
    }

    public final String w(String str) {
        c n10 = n(str);
        if (n10 instanceof h) {
            return n10.b();
        }
        StringBuilder o5 = s0.o("no string found for key <", str, ">, found [", n10 != null ? n10.g() : null, "] : ");
        o5.append(n10);
        throw new CLParsingException(o5.toString(), this);
    }

    public final String x(String str) {
        c u8 = u(str);
        if (u8 instanceof h) {
            return u8.b();
        }
        return null;
    }

    public final boolean z(String str) {
        ArrayList arrayList = this.f4104v;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            c cVar = (c) obj;
            if ((cVar instanceof d) && ((d) cVar).b().equals(str)) {
                return true;
            }
        }
        return false;
    }
}
