package androidx.compose.runtime;

/* loaded from: /home/user/work/p/classes.dex */
public final class f2 extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f1626v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f1627w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(int i, a71.c cVar, int i10) {
        super(i, cVar);
        this.f1626v = i10;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.f1626v) {
            case k5.f.J:
                f2 f2Var = new f2(2, cVar, 0);
                f2Var.f1627w = obj;
                return f2Var;
            case 1:
                f2 f2Var2 = new f2(2, cVar, 1);
                f2Var2.f1627w = obj;
                return f2Var2;
            case 2:
                f2 f2Var3 = new f2(2, cVar, 2);
                f2Var3.f1627w = obj;
                return f2Var3;
            case 3:
                f2 f2Var4 = new f2(2, cVar, 3);
                f2Var4.f1627w = obj;
                return f2Var4;
            case 4:
                f2 f2Var5 = new f2(2, cVar, 4);
                f2Var5.f1627w = obj;
                return f2Var5;
            case 5:
                f2 f2Var6 = new f2(2, cVar, 5);
                f2Var6.f1627w = obj;
                return f2Var6;
            case 6:
                f2 f2Var7 = new f2(2, cVar, 6);
                f2Var7.f1627w = obj;
                return f2Var7;
            case 7:
                f2 f2Var8 = new f2(2, cVar, 7);
                f2Var8.f1627w = obj;
                return f2Var8;
            case 8:
                f2 f2Var9 = new f2(2, cVar, 8);
                f2Var9.f1627w = obj;
                return f2Var9;
            default:
                f2 f2Var10 = new f2(2, cVar, 9);
                f2Var10.f1627w = obj;
                return f2Var10;
        }
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.f1626v) {
            case k5.f.J:
                return r((a71.c) obj2, (e2) obj).v(w61.a0.a);
            case 1:
                f2 r10 = r((a71.c) obj2, (s5.b) obj);
                w61.a0 a0Var = w61.a0.a;
                r10.v(a0Var);
                return a0Var;
            case 2:
                f2 r11 = r((a71.c) obj2, (String) obj);
                w61.a0 a0Var2 = w61.a0.a;
                r11.v(a0Var2);
                return a0Var2;
            case 3:
                f2 r12 = r((a71.c) obj2, (s5.b) obj);
                w61.a0 a0Var3 = w61.a0.a;
                r12.v(a0Var3);
                return a0Var3;
            case 4:
                f2 r13 = r((a71.c) obj2, (s5.b) obj);
                w61.a0 a0Var4 = w61.a0.a;
                r13.v(a0Var4);
                return a0Var4;
            case 5:
                f2 r14 = r((a71.c) obj2, (s5.b) obj);
                w61.a0 a0Var5 = w61.a0.a;
                r14.v(a0Var5);
                return a0Var5;
            case 6:
                f2 r15 = r((a71.c) obj2, (s5.b) obj);
                w61.a0 a0Var6 = w61.a0.a;
                r15.v(a0Var6);
                return a0Var6;
            case 7:
                f2 r16 = r((a71.c) obj2, (s5.b) obj);
                w61.a0 a0Var7 = w61.a0.a;
                r16.v(a0Var7);
                return a0Var7;
            case 8:
                return r((a71.c) obj2, (n5.p0) obj).v(w61.a0.a);
            default:
                return r((a71.c) obj2, (y71.p1) obj).v(w61.a0.a);
        }
    }

    public final Object v(Object obj) {
        int i = this.f1626v;
        w61.a0 a0Var = w61.a0.a;
        switch (i) {
            case k5.f.J:
                b71.a aVar = b71.a.r;
                sy.y.j(obj);
                return Boolean.valueOf(((e2) this.f1627w) == e2.f1607r);
            case 1:
                s5.b bVar = (s5.b) this.f1627w;
                b71.a aVar2 = b71.a.r;
                sy.y.j(obj);
                bVar.c();
                return a0Var;
            case 2:
                b71.a aVar3 = b71.a.r;
                sy.y.j(obj);
                return a0Var;
            case 3:
                s5.b bVar2 = (s5.b) this.f1627w;
                b71.a aVar4 = b71.a.r;
                sy.y.j(obj);
                bVar2.c();
                return a0Var;
            case 4:
                s5.b bVar3 = (s5.b) this.f1627w;
                b71.a aVar5 = b71.a.r;
                sy.y.j(obj);
                bVar3.c();
                return a0Var;
            case 5:
                s5.b bVar4 = (s5.b) this.f1627w;
                b71.a aVar6 = b71.a.r;
                sy.y.j(obj);
                s5.e u8 = b91.g.u("key_user_last_known_onboarding_page");
                Integer num = new Integer(2);
                bVar4.getClass();
                bVar4.g(u8, num);
                bVar4.g(b91.g.j("key_user_notifications_onboarding_shown"), Boolean.TRUE);
                return a0Var;
            case 6:
                s5.b bVar5 = (s5.b) this.f1627w;
                b71.a aVar7 = b71.a.r;
                sy.y.j(obj);
                bVar5.e(b91.g.z("key_user_notifications_missed_two_factor_dismissed"));
                return a0Var;
            case 7:
                s5.b bVar6 = (s5.b) this.f1627w;
                b71.a aVar8 = b71.a.r;
                sy.y.j(obj);
                bVar6.e(b91.g.j("key_user_notifications_onboarding_shown"));
                bVar6.e(b91.g.u("key_user_last_known_onboarding_page"));
                bVar6.e(b91.g.z("key_user_notifications_disabled_reminder_dismissed"));
                bVar6.e(b91.g.z("key_user_notifications_missed_two_factor_dismissed"));
                bVar6.e(b91.g.z("key_user_notifications_continue_setup_dismissed"));
                bVar6.e(b91.g.u("key_user_notifications_continue_setup_dismissed_count"));
                bVar6.e(b91.g.z("key_user_notifications_review_setup_dismissed"));
                return a0Var;
            case 8:
                b71.a aVar9 = b71.a.r;
                sy.y.j(obj);
                return Boolean.valueOf(!(((n5.p0) this.f1627w) instanceof n5.f0));
            default:
                b71.a aVar10 = b71.a.r;
                sy.y.j(obj);
                return Boolean.valueOf(((y71.p1) this.f1627w) != y71.p1.r);
        }
    }
}
