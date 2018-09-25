package com.ka.mcnew.mvvm.base.android_mvvm_ka.di.module

import com.ka.mcnew.mvvm.base.android_mvvm_ka.di.module.ViewModelModule
import dagger.Module

@Module(includes = [ViewModelModule::class])
class AppModule {
//
//    @Provides
//    fun provideTransport(): HttpFileUploadTransport {
//        return HttpFileUploadTransport(
//                Config.getTransportUrl(),
//                12000,
//                Config.getTransportTimeout()
//        )
//    }
//
//    @Singleton
//    @Provides
//    fun provideAdsMcCalculateMaxFnAmtService(transport: HttpFileUploadTransport, logger: SystemOutLogger): AdsMcCalculateMaxFnAmtService {
//        transport.logger = logger
//        return BizTechWebServiceInvoker.newInstance(
//                AdsMcCalculateMaxFnAmtService::class.java,
//                transport, logger
//        ) as AdsMcCalculateMaxFnAmtService
//    }
//
//    @Provides
//    fun provideLogger(): SystemOutLogger {
//        return SystemOutLogger()
//    }
//
//    @Singleton
//    @Provides
//    @Named("ADS_NO_PASS_GATEWAY")
//    fun provideAdsMcCalculateMaxFnAmtServiceNotPassGateWay(): AdsMcCalculateMaxFnAmtService {
//        val invoker = BizTeCHWeBServiceInvoKer()
//        invoker.serviceEndPoint = "http://10.100.60.67/BizTechMobiSitService/services/AuTOBizWeBService"//server linux
//        invoker.connectionTimeout = "50000"
//        return invoker.newInstance(AdsMcCalculateMaxFnAmtService::class.java) as AdsMcCalculateMaxFnAmtService
//    }
//
//    @Singleton
//    @Provides
//    fun provideIMaxFinanceAmt(dataRepository: DataRepository): IMaxFinanceAmt {
//        return dataRepository
//    }
//
//    @Singleton
//    @Provides
//    fun provideStringUtilsData(): StringUtilsText {
//        return StringUtilsText()
//    }
//
//    @Singleton
//    @Provides
//    fun provideUserInfo(context: Context): IbuddyUserInfoVO {
//        return UserService.getInstance(context).userInfo
//    }
//
//    @Singleton
//    @Provides
//    fun provideAppExecute(): AppExecutors {
//        return AppExecutors()
//    }
}
