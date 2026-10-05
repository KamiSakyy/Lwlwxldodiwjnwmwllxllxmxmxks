package vm;

import bm.u;
import com.github.domain.shortcuts.model.StoredShortcutModel;
import com.github.service.models.response.shortcuts.ShortcutType;
import ek.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k71.k;
import q01.m;
import q01.r;
import x61.n;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public final u a;

    public b(u uVar) {
        k.g(uVar, "searchQueryParser");
        this.a = uVar;
    }

    public static m a(wm.b bVar) {
        k.g(bVar, "domainItem");
        return new m(bVar.getName(), com.google.common.util.concurrent.a.M(bVar.g()), bVar.i(), bVar.K(), bVar.f(), bVar.getIcon());
    }

    public static StoredShortcutModel d(e eVar) {
        k.g(eVar, "storageItem");
        String str = eVar.a;
        String str2 = eVar.c;
        String str3 = eVar.b;
        List list = eVar.d;
        com.github.service.models.response.shortcuts.a aVar = eVar.e;
        ShortcutType shortcutType = eVar.f;
        return new StoredShortcutModel(eVar.g, eVar.h, aVar, shortcutType, str, str2, str3, list);
    }

    public static ArrayList e(List list) {
        k.g(list, "storageItems");
        ArrayList arrayList = new ArrayList(n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(d((e) it.next()));
        }
        return arrayList;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public final ek.e b(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public final ArrayList c(List list) {
        k.g(list, "serviceItems");
        ArrayList arrayList = new ArrayList(n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((r) it.next()));
        }
        return arrayList;
    }
}
