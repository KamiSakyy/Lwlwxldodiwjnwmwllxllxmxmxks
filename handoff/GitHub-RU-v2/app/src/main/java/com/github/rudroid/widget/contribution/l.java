package com.github.rudroid.widget.contribution;

import android.content.Context;
import com.github.rudroid.widget.WidgetUIState;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import kotlinx.serialization.SerializationException;
import n5.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l implements l6.g {
    public static final l a;
    public static final /* synthetic */ r71.e[] b;
    public static final m5.a c;

    public static final class a implements l0 {
        public static final a a = new a();
        public static final ContributionWidgetModel b = new ContributionWidgetModel(x61.s.r, WidgetUIState.Waiting.INSTANCE);

        public final Object a() {
            return b;
        }

        public final Object b(InputStream inputStream) {
            try {
                return (ContributionWidgetModel) l81.c.d.a(new String(k41.b.E(inputStream), t71.a.a), ContributionWidgetModel.Companion.serializer());
            } catch (SerializationException e) {
                return new ContributionWidgetModel(x61.s.r, new WidgetUIState.Error(e.getMessage()));
            }
        }

        public final void c(Object obj, OutputStream outputStream) {
            try {
                outputStream.write(t71.w.w(l81.c.d.b(ContributionWidgetModel.Companion.serializer(), (ContributionWidgetModel) obj)));
                outputStream.close();
            } finally {
            }
        }
    }

    static {
        r71.e qVar = new k71.q(l.class, "datastore", "getDatastore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        k71.xShadow.a.getClass();
        b = new r71.e[]{qVar};
        a = new l();
        c = k41.b.r("contributionWidgetState", a.a);
    }

    public final File a(Context context, String str) {
        k71.k.g(context, "context");
        k71.k.g(str, "fileKey");
        return m7.y.u(context, "contributionWidgetState");
    }

    public final Object b(Context context, String str) {
        return (n5.f) c.a(context, b[0]);
    }
    public Object g(Object p1) { return null; }
}
