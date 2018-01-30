
namespace Inspec.Ideas.Trevorisation {
    
    
    #region Component Designer generated code 
    public partial class PersonSplit_ {
        
        public static global::java.lang.Class _class {
            get {
                return global::Inspec.Ideas.Trevorisation.@__PersonSplit.staticClass;
            }
        }
    }
    #endregion
    
    #region Component Designer generated code 
    [global::net.sf.jni4net.attributes.JavaProxyAttribute(typeof(global::Inspec.Ideas.Trevorisation.PersonSplit), typeof(global::Inspec.Ideas.Trevorisation.PersonSplit_))]
    [global::net.sf.jni4net.attributes.ClrWrapperAttribute(typeof(global::Inspec.Ideas.Trevorisation.PersonSplit), typeof(global::Inspec.Ideas.Trevorisation.PersonSplit_))]
    internal sealed partial class @__PersonSplit : global::java.lang.Object {
        
        internal new static global::java.lang.Class staticClass;
        
        private @__PersonSplit(global::net.sf.jni4net.jni.JNIEnv @__env) : 
                base(@__env) {
        }
        
        private static void InitJNI(global::net.sf.jni4net.jni.JNIEnv @__env, java.lang.Class @__class) {
            global::Inspec.Ideas.Trevorisation.@__PersonSplit.staticClass = @__class;
        }
        
        private static global::System.Collections.Generic.List<global::net.sf.jni4net.jni.JNINativeMethod> @__Init(global::net.sf.jni4net.jni.JNIEnv @__env, global::java.lang.Class @__class) {
            global::System.Type @__type = typeof(__PersonSplit);
            global::System.Collections.Generic.List<global::net.sf.jni4net.jni.JNINativeMethod> methods = new global::System.Collections.Generic.List<global::net.sf.jni4net.jni.JNINativeMethod>();
            methods.Add(global::net.sf.jni4net.jni.JNINativeMethod.Create(@__type, "SplitPerson", "SplitPerson0", "(Ljava/lang/String;)Lsystem/ValueType;"));
            methods.Add(global::net.sf.jni4net.jni.JNINativeMethod.Create(@__type, "__ctorPersonSplit0", "__ctorPersonSplit0", "(Lnet/sf/jni4net/inj/IClrProxy;)V"));
            return methods;
        }
        
        private static global::net.sf.jni4net.utils.JniHandle SplitPerson0(global::System.IntPtr @__envp, global::net.sf.jni4net.utils.JniLocalHandle @__class, global::net.sf.jni4net.utils.JniLocalHandle rawData) {
            // (Ljava/lang/String;)Lsystem/ValueType;
            // (LSystem/String;)LInspec/Ideas/Trevorisation/PersonSplit+Person;
            global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.Wrap(@__envp);
            global::net.sf.jni4net.utils.JniHandle @__return = default(global::net.sf.jni4net.utils.JniHandle);
            try {
            @__return = global::net.sf.jni4net.utils.Convertor.StrongC2Jp<global::Inspec.Ideas.Trevorisation.PersonSplit.Person>(@__env, global::Inspec.Ideas.Trevorisation.PersonSplit.SplitPerson(global::net.sf.jni4net.utils.Convertor.StrongJ2CString(@__env, rawData)));
            }catch (global::System.Exception __ex){@__env.ThrowExisting(__ex);}
            return @__return;
        }
        
        private static void @__ctorPersonSplit0(global::System.IntPtr @__envp, global::net.sf.jni4net.utils.JniLocalHandle @__class, global::net.sf.jni4net.utils.JniLocalHandle @__obj) {
            // ()V
            // ()V
            global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.Wrap(@__envp);
            try {
            global::Inspec.Ideas.Trevorisation.PersonSplit @__real = new global::Inspec.Ideas.Trevorisation.PersonSplit();
            global::net.sf.jni4net.utils.Convertor.InitProxy(@__env, @__obj, @__real);
            }catch (global::System.Exception __ex){@__env.ThrowExisting(__ex);}
        }
        
        new internal sealed class ContructionHelper : global::net.sf.jni4net.utils.IConstructionHelper {
            
            public global::net.sf.jni4net.jni.IJvmProxy CreateProxy(global::net.sf.jni4net.jni.JNIEnv @__env) {
                return new global::Inspec.Ideas.Trevorisation.@__PersonSplit(@__env);
            }
        }
    }
    #endregion
}
