package com.github.rudroid.autocomplete;

import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.m0;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import v71.a0;
import v71.b0;
import v71.q1;
import y71.i1;
import y71.n1;
import y71.y;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class c extends k1 {
    public q1 A;
    public q1 B;

    /* renamed from: s, reason: collision with root package name */
    public final String f8620s;

    /* renamed from: t, reason: collision with root package name */
    public final aj.a f8621t;

    /* renamed from: u, reason: collision with root package name */
    public final aj.d f8622u;

    /* renamed from: v, reason: collision with root package name */
    public final aj.e f8623v;

    /* renamed from: w, reason: collision with root package name */
    public final com.github.rudroid.activities.util.c f8624w;

    /* renamed from: x, reason: collision with root package name */
    public final y1 f8625x;

    /* renamed from: y, reason: collision with root package name */
    public final i1 f8626y;

    /* renamed from: z, reason: collision with root package name */
    public final y1 f8627z;

    public static final /* synthetic */ class a {
        static {
            int[] iArr = new int[aj.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                aj.a aVar = aj.a.r;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                aj.a aVar2 = aj.a.r;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public c(String str, aj.a aVar, aj.b bVar, aj.d dVar, aj.e eVar, com.github.rudroid.activities.util.c cVar) {
        k71.k.g(str, "autocompleteNodeId");
        k71.k.g(aVar, "autoCompleteNodeType");
        k71.k.g(bVar, "fetchDiscussionMentionableItemsUseCase");
        k71.k.g(dVar, "fetchMentionableItemsUseCase");
        k71.k.g(eVar, "fetchMentionableUsersUseCase");
        k71.k.g(cVar, "accountHolder");
        this.f8620s = str;
        this.f8621t = aVar;
        this.f8622u = dVar;
        this.f8623v = eVar;
        this.f8624w = cVar;
        y1 s2 = m0.s(fl.f.Companion, null);
        this.f8625x = s2;
        this.f8626y = new i1(s2);
        y1 c10 = n1.c((Object) null);
        this.f8627z = c10;
        n1.A(new y(n1.o(c10, 250L), new o(this, null), 6), d1.k(this));
    }

    public final void P(String str) {
        int ordinal = this.f8621t.ordinal();
        if (ordinal == 0) {
            b0.z(d1.k(this), (a71.h) null, (a0) null, new g(this, str, null), 3);
            return;
        }
        if (ordinal == 1) {
            q1 q1Var = this.B;
            if (q1Var != null) {
                q1Var.m((CancellationException) null);
            }
            this.B = b0.z(d1.k(this), (a71.h) null, (a0) null, new k(this, str, null), 3);
            return;
        }
        if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        q1 q1Var2 = this.A;
        if (q1Var2 != null) {
            q1Var2.m((CancellationException) null);
        }
        this.A = b0.z(d1.k(this), (a71.h) null, (a0) null, new n(this, str, null), 3);
    }
}
