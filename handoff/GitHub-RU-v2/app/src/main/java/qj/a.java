package qj;

import android.content.Context;
import com.github.domain.database.GitHubDatabase;
import m7.s;
import oa.j;
import y41.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a extends oa.c {
    public final Context b;

    public a(Context context) {
        this.b = context;
    }

    public final Object b(j jVar) {
        String str = jVar.a;
        Context context = this.b;
        s w = t1.w(context, GitHubDatabase.class, str);
        GitHubDatabase.Companion.getClass();
        w.a(new p7.a[]{GitHubDatabase.l, new c(context, 0), GitHubDatabase.m, GitHubDatabase.n, GitHubDatabase.o});
        w.p = false;
        w.q = true;
        w.r = false;
        return (GitHubDatabase) w.b();
    }
}
