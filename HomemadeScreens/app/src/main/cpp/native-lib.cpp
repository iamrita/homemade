#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_android2018_amrita_com_homemadescreens_MealActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
