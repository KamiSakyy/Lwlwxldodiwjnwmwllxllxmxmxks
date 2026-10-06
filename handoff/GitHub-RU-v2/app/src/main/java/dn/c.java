package dn;

import androidx.compose.runtime.f2;
import com.github.testingsettings.TestingSettingsFragment;
import com.google.android.gms.internal.measurement.z3;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c extends c71.j implements j71.e {
    public Object A;
    public final /* synthetic */ int v;
    public int w;
    public Object x;
    public final /* synthetic */ Object y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TestingSettingsFragment testingSettingsFragment, a71.c cVar) {
        super(2, cVar);
        this.v = 3;
        this.y = testingSettingsFragment;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                c cVar2 = new c((e) this.A, (oa.j) this.y, this.z, cVar, 0);
                cVar2.x = obj;
                return cVar2;
            case 1:
                c cVar3 = new c((g) this.A, (oa.j) this.y, this.z, cVar, 1);
                cVar3.x = obj;
                return cVar3;
            case 2:
                return new c((m0.s) this.x, this.z, (q71.g) this.A, (h1.c0) this.y, cVar, 2);
            case 3:
                return new c((TestingSettingsFragment) this.y, cVar);
            default:
                return new c((y71.i[]) this.x, this.z, (AtomicInteger) this.A, (x71.h) this.y, cVar, 4);
        }
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.v) {
            case 0:
                return r((a71.c) obj2, (byte[]) obj).v(w61.a0.a);
            case 1:
                return r((a71.c) obj2, (byte[]) obj).v(w61.a0.a);
            case 2:
                return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
            case 3:
                return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
            default:
                return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Iterator it;
        int i;
        switch (this.v) {
            case 0:
                byte[] bArr = (byte[]) this.x;
                b71.a aVar = b71.a.r;
                int i2 = this.w;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return obj;
                }
                sy.y.j(obj);
                e11.a aVar2 = (e11.a) ((e) this.A).b.a((oa.j) this.y);
                int i3 = this.z;
                this.x = null;
                this.w = 1;
                Object a = aVar2.a(i3, bArr);
                return a == aVar ? aVar : a;
            case 1:
                byte[] bArr2 = (byte[]) this.x;
                b71.a aVar3 = b71.a.r;
                int i4 = this.w;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return obj;
                }
                sy.y.j(obj);
                e11.a aVar4 = (e11.a) ((g) this.A).b.a((oa.j) this.y);
                int i5 = this.z;
                this.x = null;
                this.w = 1;
                Object a2 = aVar4.a(i5, bArr2);
                return a2 == aVar3 ? aVar3 : a2;
            case 2:
                b71.a aVar5 = b71.a.r;
                int i6 = this.w;
                if (i6 == 0) {
                    sy.y.j(obj);
                    m0.s sVar = (m0.s) this.x;
                    int i7 = (((this.z - ((q71.e) ((q71.g) this.A)).r) * 12) + ((h1.c0) this.y).b) - 1;
                    this.w = 1;
                    if (m0.s.j(sVar, i7, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 3:
                TestingSettingsFragment testingSettingsFragment = (TestingSettingsFragment) this.y;
                b71.a aVar6 = b71.a.r;
                int i8 = this.z;
                if (i8 == 0) {
                    sy.y.j(obj);
                    gi.c u4 = testingSettingsFragment.u4();
                    s5.e eVar = gi.d.g;
                    this.z = 1;
                    if (u4.b(eVar, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i9 = this.w;
                        Iterator it2 = (Iterator) this.A;
                        TestingSettingsFragment testingSettingsFragment2 = (TestingSettingsFragment) this.x;
                        sy.y.j(obj);
                        it = it2;
                        i = i9;
                        testingSettingsFragment = testingSettingsFragment2;
                        while (it.hasNext()) {
                            oa.j jVar = (oa.j) it.next();
                            oa.e eVar2 = testingSettingsFragment.A0;
                            if (eVar2 == null) {
                                k71.k.m("cachedUserDataStorePreferencesFactory");
                                throw null;
                            }
                            n5.f fVar = (n5.f) eVar2.a(jVar);
                            f2 f2Var = new f2(2, (a71.c) null, 6);
                            this.x = testingSettingsFragment;
                            this.A = it;
                            this.w = i;
                            this.z = 2;
                            if (z3.n(fVar, f2Var, this) == aVar6) {
                                return aVar6;
                            }
                        }
                        return w61.a0.a;
                    }
                    sy.y.j(obj);
                }
                oa.m mVar = testingSettingsFragment.z0;
                if (mVar == null) {
                    k71.k.m("userManager");
                    throw null;
                }
                it = mVar.e().iterator();
                i = 0;
                while (it.hasNext()) {
                }
                return w61.a0.a;
            default:
                AtomicInteger atomicInteger = (AtomicInteger) this.A;
                x71.h hVar = (x71.h) this.y;
                b71.a aVar7 = b71.a.r;
                int i11 = this.w;
                try {
                    if (i11 == 0) {
                        sy.y.j(obj);
                        y71.i[] iVarArr = (y71.i[]) this.x;
                        int i12 = this.z;
                        y71.i iVar = iVarArr[i12];
                        z71.m mVar2 = new z71.m(hVar, i12);
                        this.w = 1;
                        if (iVar.b(mVar2, this) == aVar7) {
                            return aVar7;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        hVar.e((Throwable) null);
                    }
                    return w61.a0.a;
                } finally {
                    if (atomicInteger.decrementAndGet() == 0) {
                        hVar.e((Throwable) null);
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, int i, Object obj2, Object obj3, a71.c cVar, int i2) {
        super(2, cVar);
        this.v = i2;
        this.x = obj;
        this.z = i;
        this.A = obj2;
        this.y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, oa.j jVar, int i, a71.c cVar, int i2) {
        super(2, cVar);
        this.v = i2;
        this.A = obj;
        this.y = jVar;
        this.z = i;
    }
    public Object v(Object) { return null; }
}
