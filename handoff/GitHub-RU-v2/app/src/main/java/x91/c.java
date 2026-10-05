package x91;

import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import c21.h0;
import java.util.ArrayList;
import org.intellij.markdown.MarkdownParsingException;
import w2.t;
import x.i;
import x1.k;

/* loaded from: /home/user/work/p/classes5.dex */
public final class c implements x1.g {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public c(r91.a aVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            h0 h0Var = aVar.b;
            if (h0Var == null) {
                break;
            }
            boolean equals = h0Var.equals(j91.a.q0);
            r91.b bVar = new r91.b(aVar.b, aVar.g, aVar.h, arrayList.size(), equals ? -1 : arrayList2.size());
            arrayList.add(bVar);
            if (!equals) {
                arrayList2.add(bVar);
            }
            h0 h0Var2 = aVar.c;
            aVar.b = h0Var2;
            aVar.g = aVar.h;
            if (h0Var2 != null) {
                aVar.b();
            }
        }
        this.a = arrayList;
        this.b = arrayList2;
        this.c = aVar.d;
        this.d = aa1.b.b0(aVar.e, aVar.f);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((r91.b) arrayList.get(i)).d != i) {
                throw new MarkdownParsingException("");
            }
        }
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((r91.b) arrayList2.get(i2)).e != i2) {
                throw new MarkdownParsingException("");
            }
        }
    }

    public char a(int i) {
        q71.g gVar = (q71.g) this.d;
        if (i >= ((q71.e) gVar).r && i <= ((q71.e) gVar).s) {
            return ((CharSequence) this.c).charAt(i);
        }
        return (char) 0;
    }

    public c(t tVar, k kVar) {
        this.a = tVar;
        this.b = kVar;
        AutofillManager autofillManager = (AutofillManager) tVar.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.c = autofillManager;
            tVar.setImportantForAutofill(1);
            AutofillId autofillId = tVar.getAutofillId();
            if (autofillId != null) {
                this.d = autofillId;
                return;
            }
            throw i.p("Required value was null.");
        }
        throw new IllegalStateException("Autofill service could not be located.");
    }
}
