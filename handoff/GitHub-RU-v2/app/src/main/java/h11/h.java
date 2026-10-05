package h11;

import androidx.compose.runtime.f2;
import com.github.testingsettings.TestingSettingsFragment;
import com.google.android.gms.internal.measurement.z3;
import sy.y;
import v71.z;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ TestingSettingsFragment x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(TestingSettingsFragment testingSettingsFragment, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.x = testingSettingsFragment;
    }

    @Override // c71.a
    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                return new h(this.x, cVar, 0);
            case 1:
                return new h(this.x, cVar, 1);
            case 2:
                return new h(this.x, cVar, 2);
            case 3:
                return new h(this.x, cVar, 3);
            case 4:
                return new h(this.x, cVar, 4);
            case 5:
                return new h(this.x, cVar, 5);
            default:
                return new h(this.x, cVar, 6);
        }
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        z zVar = (z) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.v) {
        }
        return ((h) r(cVar, zVar)).v(a0.a);
    }

    @Override // c71.a
    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.w;
                TestingSettingsFragment testingSettingsFragment = this.x;
                if (i == 0) {
                    y.j(obj);
                    n5.f fVar = testingSettingsFragment.B0;
                    if (fVar == null) {
                        k71.k.m("createNewIssueTooltipsDataStore");
                        throw null;
                    }
                    f2 f2Var = new f2(2, (a71.c) null, 3);
                    this.w = 1;
                    if (z3.n(fVar, f2Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                testingSettingsFragment.v4().b(ei.g.E, false);
                return a0.a;
            case 1:
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                TestingSettingsFragment testingSettingsFragment2 = this.x;
                if (i2 == 0) {
                    y.j(obj);
                    n5.f fVar2 = testingSettingsFragment2.C0;
                    if (fVar2 == null) {
                        k71.k.m("copilotHomeTooltipsDataStore");
                        throw null;
                    }
                    f2 f2Var2 = new f2(2, (a71.c) null, 4);
                    this.w = 1;
                    if (z3.n(fVar2, f2Var2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                testingSettingsFragment2.v4().b(ei.g.F, false);
                return a0.a;
            case 2:
                b71.a aVar3 = b71.a.r;
                int i3 = this.w;
                if (i3 == 0) {
                    y.j(obj);
                    gi.c u4 = this.x.u4();
                    s5.e eVar = gi.d.j;
                    this.w = 1;
                    if (u4.b(eVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            case 3:
                b71.a aVar4 = b71.a.r;
                int i4 = this.w;
                if (i4 == 0) {
                    y.j(obj);
                    gi.c u42 = this.x.u4();
                    s5.e eVar2 = gi.d.k;
                    this.w = 1;
                    if (u42.b(eVar2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            case 4:
                b71.a aVar5 = b71.a.r;
                int i5 = this.w;
                if (i5 == 0) {
                    y.j(obj);
                    gi.c u43 = this.x.u4();
                    s5.e eVar3 = gi.d.l;
                    this.w = 1;
                    if (u43.b(eVar3, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            case 5:
                b71.a aVar6 = b71.a.r;
                int i6 = this.w;
                if (i6 == 0) {
                    y.j(obj);
                    gi.c u44 = this.x.u4();
                    s5.e eVar4 = gi.d.m;
                    this.w = 1;
                    if (u44.b(eVar4, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            default:
                b71.a aVar7 = b71.a.r;
                int i7 = this.w;
                if (i7 == 0) {
                    y.j(obj);
                    gi.c u45 = this.x.u4();
                    s5.e eVar5 = gi.d.n;
                    this.w = 1;
                    if (u45.b(eVar5, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
        }
    }
}
