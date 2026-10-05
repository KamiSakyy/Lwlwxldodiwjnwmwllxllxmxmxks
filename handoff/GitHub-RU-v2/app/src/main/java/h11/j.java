package h11;

import android.content.Context;
import androidx.compose.runtime.f2;
import com.github.testingsettings.TestingSettingsFragment;
import com.google.android.gms.internal.measurement.z3;
import java.util.Iterator;
import oa.m;
import rm0.wa;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j extends c71.j implements j71.c {
    public Object A;
    public final /* synthetic */ int v;
    public int w;
    public int x;
    public Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TestingSettingsFragment testingSettingsFragment, a71.c cVar) {
        super(1, cVar);
        this.v = 0;
        this.z = testingSettingsFragment;
    }

    @Override // j71.c
    public final Object k(Object obj) {
        switch (this.v) {
            case 0:
                return new j((TestingSettingsFragment) this.z, (a71.c) obj).v(a0.a);
            case 1:
                return new j((wa) this.y, (String) this.z, (String) this.A, this.x, (a71.c) obj, 1).v(a0.a);
            case 2:
                return new j((wa) this.y, (String) this.z, (String) this.A, this.x, (a71.c) obj, 2).v(a0.a);
            case 3:
                return new j((wa) this.y, (String) this.z, (String) this.A, this.x, (a71.c) obj, 3).v(a0.a);
            default:
                return new j((wa) this.y, (String) this.z, (String) this.A, this.x, (a71.c) obj, 4).v(a0.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0122  */
    @Override // c71.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Iterator it;
        TestingSettingsFragment testingSettingsFragment;
        int i;
        switch (this.v) {
            case 0:
                TestingSettingsFragment testingSettingsFragment2 = (TestingSettingsFragment) this.z;
                b71.a aVar = b71.a.r;
                int i2 = this.x;
                if (i2 == 0) {
                    y.j(obj);
                    gi.c u4 = testingSettingsFragment2.u4();
                    Boolean bool = Boolean.TRUE;
                    s5.e eVar = gi.d.e;
                    this.x = 1;
                    if (u4.d(this, bool, eVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i = this.w;
                        it = (Iterator) this.A;
                        testingSettingsFragment = (TestingSettingsFragment) this.y;
                        y.j(obj);
                        while (it.hasNext()) {
                            oa.j jVar = (oa.j) it.next();
                            oa.e eVar2 = testingSettingsFragment.A0;
                            if (eVar2 == null) {
                                k71.k.m("cachedUserDataStorePreferencesFactory");
                                throw null;
                            }
                            n5.f fVar = (n5.f) eVar2.a(jVar);
                            f2 f2Var = new f2(2, (a71.c) null, 5);
                            this.y = testingSettingsFragment;
                            this.A = it;
                            this.w = i;
                            this.x = 2;
                            if (z3.n(fVar, f2Var, this) == aVar) {
                                return aVar;
                            }
                        }
                        fi.c cVar = fi.d.Companion;
                        Context i4 = testingSettingsFragment2.i4();
                        cVar.getClass();
                        fi.c.a(i4);
                        testingSettingsFragment2.v4().b(ei.g.y, false);
                        return a0.a;
                    }
                    y.j(obj);
                }
                m mVar = testingSettingsFragment2.z0;
                if (mVar == null) {
                    k71.k.m("userManager");
                    throw null;
                }
                it = mVar.e().iterator();
                testingSettingsFragment = testingSettingsFragment2;
                i = 0;
                while (it.hasNext()) {
                }
                fi.c cVar2 = fi.d.Companion;
                Context i42 = testingSettingsFragment2.i4();
                cVar2.getClass();
                fi.c.a(i42);
                testingSettingsFragment2.v4().b(ei.g.y, false);
                return a0.a;
            case 1:
                b71.a aVar2 = b71.a.r;
                int i3 = this.w;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return obj;
                }
                y.j(obj);
                y01.a aVar3 = ((wa) this.y).t;
                String str = (String) this.z;
                String str2 = (String) this.A;
                int i5 = this.x;
                this.w = 1;
                Object a = aVar3.a(str, str2, i5, this);
                return a == aVar2 ? aVar2 : a;
            case 2:
                b71.a aVar4 = b71.a.r;
                int i6 = this.w;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return obj;
                }
                y.j(obj);
                y01.a aVar5 = ((wa) this.y).t;
                String str3 = (String) this.z;
                String str4 = (String) this.A;
                int i7 = this.x;
                this.w = 1;
                Object a2 = aVar5.a(str3, str4, i7, this);
                return a2 == aVar4 ? aVar4 : a2;
            case 3:
                b71.a aVar6 = b71.a.r;
                int i8 = this.w;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return obj;
                }
                y.j(obj);
                y01.a aVar7 = ((wa) this.y).t;
                String str5 = (String) this.z;
                String str6 = (String) this.A;
                int i9 = this.x;
                this.w = 1;
                Object a3 = aVar7.a(str5, str6, i9, this);
                return a3 == aVar6 ? aVar6 : a3;
            default:
                b71.a aVar8 = b71.a.r;
                int i10 = this.w;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return obj;
                }
                y.j(obj);
                y01.a aVar9 = ((wa) this.y).t;
                String str7 = (String) this.z;
                String str8 = (String) this.A;
                int i12 = this.x;
                this.w = 1;
                Object a4 = aVar9.a(str7, str8, i12, this);
                return a4 == aVar8 ? aVar8 : a4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, String str, String str2, int i, a71.c cVar, int i2) {
        super(1, cVar);
        this.v = i2;
        this.y = obj;
        this.z = str;
        this.A = str2;
        this.x = i;
    }
}
