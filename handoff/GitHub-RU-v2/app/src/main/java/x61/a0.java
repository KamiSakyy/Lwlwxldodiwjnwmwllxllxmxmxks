package x61;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a0 extends c71.i implements j71.e {
    public final /* synthetic */ int A;
    public final /* synthetic */ Iterator B;
    public Object t;
    public Iterator u;
    public int v;
    public int w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(int i, int i2, Iterator it, a71.c cVar) {
        super(2, cVar);
        this.z = i;
        this.A = i2;
        this.B = it;
    }

    @Override // c71.a
    public final a71.c r(a71.c cVar, Object obj) {
        a0 a0Var = new a0(this.z, this.A, this.B, cVar);
        a0Var.y = obj;
        return a0Var;
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        return ((a0) r((a71.c) obj2, (s71.i) obj)).v(w61.a0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b4  */
    @Override // c71.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        int i;
        int i2;
        int i3;
        Iterator it;
        z zVar;
        ArrayList arrayList;
        int i4;
        Iterator it2;
        int i5;
        int i6;
        z zVar2;
        boolean z;
        Object[] array;
        s71.i iVar = (s71.i) this.y;
        b71.a aVar = b71.a.r;
        int i7 = this.x;
        int i8 = this.A;
        boolean z2 = true;
        int i9 = this.z;
        if (i7 == 0) {
            sy.y.j(obj);
            int i10 = i9 <= 1024 ? i9 : 1024;
            i = i8 - i9;
            Iterator it3 = this.B;
            if (i >= 0) {
                arrayList = new ArrayList(i10);
                i4 = i10;
                it2 = it3;
                i5 = 0;
                while (it2.hasNext()) {
                }
                if (!arrayList.isEmpty()) {
                }
            } else {
                z zVar3 = new z(0, new Object[i10]);
                i2 = i10;
                i3 = i;
                it = it3;
                zVar = zVar3;
                while (true) {
                    int i12 = zVar.s;
                    Object[] objArr = zVar.r;
                    if (it.hasNext()) {
                    }
                    z2 = z;
                }
            }
        } else if (i7 != 1) {
            if (i7 == 2) {
            } else if (i7 == 3) {
                i3 = this.w;
                i2 = this.v;
                it = this.u;
                zVar = (z) this.t;
                sy.y.j(obj);
                zVar.b(i8);
                while (true) {
                    int i122 = zVar.s;
                    Object[] objArr2 = zVar.r;
                    if (it.hasNext()) {
                        i6 = i2;
                        zVar2 = zVar;
                        break;
                    }
                    Object next = it.next();
                    z = z2;
                    if (zVar.a() == i122) {
                        throw new IllegalStateException("ring buffer is full");
                    }
                    int i13 = zVar.t;
                    int i14 = zVar.u;
                    objArr2[(i13 + i14) % i122] = next;
                    zVar.u = i14 + 1;
                    if (zVar.a() == i122) {
                        if (zVar.u >= i9) {
                            ArrayList arrayList2 = new ArrayList(zVar);
                            this.y = iVar;
                            this.t = zVar;
                            this.u = it;
                            this.v = i2;
                            this.w = i3;
                            this.x = 3;
                            iVar.b(this, arrayList2);
                            b71.a aVar2 = b71.a.r;
                            return aVar;
                        }
                        int i15 = i122 + (i122 >> 1) + 1;
                        if (i15 > i9) {
                            i15 = i9;
                        }
                        if (zVar.t == 0) {
                            array = Arrays.copyOf(objArr2, i15);
                            k71.k.f(array, "copyOf(...)");
                        } else {
                            array = zVar.toArray(new Object[i15]);
                        }
                        zVar = new z(zVar.u, array);
                    }
                    z2 = z;
                }
            } else if (i7 == 4) {
                i3 = this.w;
                i6 = this.v;
                zVar2 = (z) this.t;
                sy.y.j(obj);
                zVar2.b(i8);
                if (zVar2.u > i8) {
                    ArrayList arrayList3 = new ArrayList(zVar2);
                    this.y = iVar;
                    this.t = zVar2;
                    this.u = null;
                    this.v = i6;
                    this.w = i3;
                    this.x = 4;
                    iVar.b(this, arrayList3);
                    b71.a aVar3 = b71.a.r;
                    return aVar;
                }
                if (!zVar2.isEmpty()) {
                    this.y = null;
                    this.t = null;
                    this.u = null;
                    this.v = i6;
                    this.w = i3;
                    this.x = 5;
                    iVar.b(this, zVar2);
                    b71.a aVar4 = b71.a.r;
                    return aVar;
                }
            } else {
                if (i7 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            sy.y.j(obj);
        } else {
            i5 = this.w;
            i4 = this.v;
            it2 = this.u;
            sy.y.j(obj);
            arrayList = new ArrayList(i9);
            i = i5;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (i5 > 0) {
                    i5--;
                } else {
                    arrayList.add(next2);
                    if (arrayList.size() == i9) {
                        this.y = iVar;
                        this.t = arrayList;
                        this.u = it2;
                        this.v = i4;
                        this.w = i;
                        this.x = 1;
                        iVar.b(this, arrayList);
                        b71.a aVar5 = b71.a.r;
                        return aVar;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.y = null;
                this.t = null;
                this.u = null;
                this.v = i4;
                this.w = i;
                this.x = 2;
                iVar.b(this, arrayList);
                b71.a aVar6 = b71.a.r;
                return aVar;
            }
        }
        return w61.a0.a;
    }
}
