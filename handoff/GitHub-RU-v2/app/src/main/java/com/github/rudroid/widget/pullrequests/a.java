package com.github.rudroid.widget.pullrequests;

import android.content.Context;
import com.github.rudroid.widget.WidgetUIState;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import k71.x;
import kotlinx.serialization.SerializationException;
import m7.y;
import n5.l0;
import t71.w;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements l6.g {
    public static final a a;
    public static final /* synthetic */ r71.e[] b;
    public static final m5.a c;

    /* renamed from: com.github.rudroid.widget.pullrequests.a$a, reason: collision with other inner class name */
    public static final class C0022a implements l0 {
        public static final C0022a a = new C0022a();
        public static final PullRequestsWidgetModel b = new PullRequestsWidgetModel(null, WidgetUIState.Waiting.INSTANCE);

        public final Object a() {
            return b;
        }

        public final Object b(InputStream inputStream) {
            try {
                return (PullRequestsWidgetModel) l81.c.d.a(new String(k41.b.E(inputStream), t71.a.a), PullRequestsWidgetModel.Companion.serializer());
            } catch (SerializationException e) {
                return new PullRequestsWidgetModel(null, new WidgetUIState.Error(e.getMessage()));
            }
        }

        public final void c(Object obj, OutputStream outputStream) {
            try {
                outputStream.write(w.w(l81.c.d.b(PullRequestsWidgetModel.Companion.serializer(), (PullRequestsWidgetModel) obj)));
                outputStream.close();
            } finally {
            }
        }
    }

    static {
        r71.e qVar = new k71.q(a.class, "datastore", "getDatastore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        x.a.getClass();
        b = new r71.e[]{qVar};
        a = new a();
        c = k41.b.r("pulLRequestsWidgetState", C0022a.a);
    }

    public final File a(Context context, String str) {
        k71.k.g(context, "context");
        k71.k.g(str, "fileKey");
        return y.u(context, "pulLRequestsWidgetState");
    }

    public final Object b(Context context, String str) {
        return (n5.f) c.a(context, b[0]);
    }
}
