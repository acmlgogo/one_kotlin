package com.storm.cftest.base;

import java.util.List;

/**
 * 作者：程峰 on 2017/6/8
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */

public class Comment {


    /**
     * res : 0
     * data : {"count":124,"data":[{"id":"42289","quote":"","content":"太好了你没死\n对啊我睡着了\n(太萌了)","praisenum":111,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-02 09:33:47","created_at":"2017-06-02 09:33:47","updated_at":"0000-00-00 00:00:00","user":{"user_id":"6574935","user_name":"你兜里只有五块钱","web_url":"http://wx.qlogo.cn/mmopen/hLxK5cQqoPYoaAGjxZJfWA2tEkEiaeKE7qXo5hRPibf2nv62gUU7qhwllScBPTHeaYWV08Y2O8XHLuBIvtmUceibX5ITcdCiamnw/0"},"touser":null,"type":0},{"id":"42286","quote":"","content":"猎懒不是死神啊，他是来拯救海榴小姐的。","praisenum":71,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-02 09:20:34","created_at":"2017-06-02 09:20:34","updated_at":"0000-00-00 00:00:00","user":{"user_id":"7957501","user_name":"早安海棠","web_url":"http://image.wufazhuce.com/FhYaboqzrbpRBWdFchs1yP7XEeiX"},"touser":null,"type":0},{"id":"42300","quote":"","content":"原来人生最糟糕的结局不是失败，而是对方不在。","praisenum":62,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-02 11:22:45","created_at":"2017-06-02 11:22:45","updated_at":"0000-00-00 00:00:00","user":{"user_id":"7807101","user_name":"White Pony","web_url":"http://q.qlogo.cn/qqapp/1104596227/9F5F60DA7246B0F0E12A5F7D5AB03033/100"},"touser":null,"type":0},{"id":"42305","quote":"","content":"为什么我觉得这个故事好温暖😊","praisenum":38,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-02 13:21:05","created_at":"2017-06-02 13:21:05","updated_at":"0000-00-00 00:00:00","user":{"user_id":"7026849","user_name":"🐙","web_url":"http://q.qlogo.cn/qqapp/1104596227/F21EF766B74DF031635BAAFB2006A174/40"},"touser":null,"type":0},{"id":"42415","quote":"","content":"思念是你睡了，我还在傻傻得翻着关于你的一切","praisenum":23,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-04 07:30:49","created_at":"2017-06-04 07:30:49","updated_at":"0000-00-00 00:00:00","user":{"user_id":"7993469","user_name":"而立之年惑余生","web_url":"http://wx.qlogo.cn/mmopen/ajNVdqHZLLDN1Do6oevWiaL7iaRhic6Xq6Yx0ZSlGOowtpL8iaphACl83pBrHm6WicVabjYRnRfIGDpIz0emyzCalibNPL3UDStXKN9kYFeF44aXM/0"},"touser":null,"type":0},{"id":"42303","quote":"","content":"为了女王下了ONE。","praisenum":23,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-02 11:59:43","created_at":"2017-06-02 11:59:43","updated_at":"0000-00-00 00:00:00","user":{"user_id":"5595248","user_name":"ATLAS","web_url":"http://image.wufazhuce.com/FvwLm6_0rtBKqApE94Wac1NaiFls"},"touser":null,"type":0},{"id":"42295","quote":"","content":"每次的题记简直经典","praisenum":22,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-02 10:52:26","created_at":"2017-06-02 10:52:26","updated_at":"0000-00-00 00:00:00","user":{"user_id":"2177722","user_name":"天天想放假","web_url":"http://tp4.sinaimg.cn/1174093963/180/5699939122/0"},"touser":null,"type":0},{"id":"42317","quote":"","content":"太暖了","praisenum":9,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-02 17:45:19","created_at":"2017-06-02 17:45:19","updated_at":"0000-00-00 00:00:00","user":{"user_id":"5505731","user_name":"ސސ    ސސސސސސސސސސސސ","web_url":"http://q.qlogo.cn/qqapp/1104596227/4007C99B2DFED249B2C4AB146096B2AC/40"},"touser":null,"type":0},{"id":"43038","quote":"","content":"谁是谁是死神，谁又是谁的救星","praisenum":0,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-09 08:31:04","created_at":"2017-06-09 08:31:04","updated_at":"0000-00-00 00:00:00","user":{"user_id":"8034773","user_name":"喵菌","web_url":"http://wx.qlogo.cn/mmopen/glb9kzB1HGZxQtzubXjNud1fpNdkL4bsRcDelgkJyicBcPntqiaK73yrlyRu7P83dbDR5fOVV2JGZQlSdNOhJzjN0468e6b7SC/0"},"touser":null,"type":1},{"id":"43002","quote":"","content":"我都连续失眠十年了吧，从小学开始失眠的。","praisenum":0,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-08 22:40:56","created_at":"2017-06-08 22:40:56","updated_at":"0000-00-00 00:00:00","user":{"user_id":"7097566","user_name":"华沙","web_url":"http://q.qlogo.cn/qqapp/1104596227/B71193600F70EB3D1A8EB8EC090A90A1/40"},"touser":null,"type":1},{"id":"42987","quote":"","content":"这篇文章以前在最小说上发过吧 好熟悉","praisenum":0,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-08 18:00:10","created_at":"2017-06-08 18:00:10","updated_at":"0000-00-00 00:00:00","user":{"user_id":"3020744","user_name":"布崽子a","web_url":"http://tp3.sinaimg.cn/2883689374/180/5674389001/0"},"touser":null,"type":1},{"id":"42985","quote":"祝我明天的文综和英语能考个好成绩","content":"考的怎么样？","praisenum":0,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-08 17:22:22","created_at":"2017-06-08 17:22:22","updated_at":"0000-00-00 00:00:00","user":{"user_id":"7992509","user_name":"杨柳岸","web_url":"http://wx.qlogo.cn/mmopen/mIuibiaBIGnQGGavAWoviaibD4BmLIknSOOg8ibqMlibk5hibGLwq2LGJlx5gJrDY3hTAVqVN0QqwEXopFNV2cfO40QmW9ibdat6cTN3/0"},"touser":{"user_id":"6081000","user_name":"君和惜","web_url":"http://q.qlogo.cn/qqapp/1104596227/8E22DAAC90AD50F3A34B4B7B85379F76/100"},"type":1},{"id":"42976","quote":"","content":"什么是二次元，三次元？这是学术名词还是网络名词？我out了","praisenum":0,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-08 13:05:25","created_at":"2017-06-08 13:05:25","updated_at":"0000-00-00 00:00:00","user":{"user_id":"6920455","user_name":"茶未喝光已变酸","web_url":"http://image.wufazhuce.com/Fh5jWM-d8xaexM6_coPIs7ncHqdU"},"touser":null,"type":1},{"id":"42948","quote":"我想说的是 能否放些有深度的文章？ 生活不是只有爱情","content":"你这么缺营养？","praisenum":4,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-08 07:01:20","created_at":"2017-06-08 07:01:20","updated_at":"0000-00-00 00:00:00","user":{"user_id":"5601160","user_name":"Healer","web_url":"http://image.wufazhuce.com/Fhm72ISGKfm5I3UQnd2dnWJuq3Yy"},"touser":{"user_id":"4847462","user_name":"春雨里洗过的太阳","web_url":"http://image.wufazhuce.com/FgTepHqccKbmEH3vrhYnfCrxJVmP"},"type":1},{"id":"42944","quote":"","content":"可能你不快乐，可我要你快乐。","praisenum":1,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-08 01:01:19","created_at":"2017-06-08 01:01:19","updated_at":"0000-00-00 00:00:00","user":{"user_id":"8053611","user_name":"*** **** 4982","web_url":"http://image.wufazhuce.com/app3.0head.png"},"touser":null,"type":1},{"id":"42934","quote":"","content":"祝我明天的文综和英语能考个好成绩","praisenum":5,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-07 23:09:41","created_at":"2017-06-07 23:09:41","updated_at":"0000-00-00 00:00:00","user":{"user_id":"6081000","user_name":"君和惜","web_url":"http://q.qlogo.cn/qqapp/1104596227/8E22DAAC90AD50F3A34B4B7B85379F76/100"},"touser":null,"type":1},{"id":"42895","quote":"","content":"好可爱好温暖的故事","praisenum":0,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-07 13:09:14","created_at":"2017-06-07 13:09:14","updated_at":"0000-00-00 00:00:00","user":{"user_id":"1472719","user_name":"廖廖廖廖终于喜欢雨下整夜","web_url":"http://image.wufazhuce.com/Fsy7ACSa85T0gAFRvKJ92sggPcXt"},"touser":null,"type":1},{"id":"42890","quote":"","content":"头发会长 身材会瘦 不是为了你的到来 是因为你的离开","praisenum":2,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-07 11:24:55","created_at":"2017-06-07 11:24:55","updated_at":"0000-00-00 00:00:00","user":{"user_id":"6737147","user_name":"Glory","web_url":"http://image.wufazhuce.com/FmskTzBUBAdhpcebYTqrWVrnvP7v"},"touser":null,"type":1},{"id":"42884","quote":"","content":"爱情是一个人的兵荒马乱","praisenum":2,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-07 08:59:09","created_at":"2017-06-07 08:59:09","updated_at":"0000-00-00 00:00:00","user":{"user_id":"7227872","user_name":"微微橙","web_url":"http://image.wufazhuce.com/FohGvuOy4-4mbUnSmo65jT6WFDc6"},"touser":null,"type":1},{"id":"42867","quote":"","content":"怎么看全文","praisenum":0,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-06 23:57:42","created_at":"2017-06-06 23:57:42","updated_at":"0000-00-00 00:00:00","user":{"user_id":"6753548","user_name":"見字如面","web_url":"http://wx.qlogo.cn/mmopen/hLxK5cQqoPYVNUHbEY57ElkHWKDdibxDibyG4K2eia54ice6rNdSo45JAEj3nD53YuMicvNTmbufgZnvjr0suXQiajGuM7ia0aDbF48/0"},"touser":null,"type":1},{"id":"42859","quote":"猎懒不是死神啊，他是来拯救海榴小姐的。","content":"不管你在多少人眼里是死神，但总有一个人你对他而言是救星","praisenum":2,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-06 18:01:54","created_at":"2017-06-06 18:01:54","updated_at":"0000-00-00 00:00:00","user":{"user_id":"392547","user_name":"byway下火海","web_url":"http://tp2.sinaimg.cn/2506615561/180/40030807319/0"},"touser":{"user_id":"7957501","user_name":"早安海棠","web_url":"http://image.wufazhuce.com/FhYaboqzrbpRBWdFchs1yP7XEeiX"},"type":1},{"id":"42854","quote":"","content":"喜欢这样的故事","praisenum":0,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-06 14:14:50","created_at":"2017-06-06 14:14:50","updated_at":"0000-00-00 00:00:00","user":{"user_id":"7997144","user_name":"黑色幽默","web_url":"http://q.qlogo.cn/qqapp/1104596227/08715F96EE2DF8904A4549120FCD0785/40"},"touser":null,"type":1},{"id":"42843","quote":"","content":"如果开始 那就要有结束的准备？ \n可是我怕结束","praisenum":1,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-06 03:01:19","created_at":"2017-06-06 03:01:19","updated_at":"0000-00-00 00:00:00","user":{"user_id":"8055378","user_name":"吴力山","web_url":"http://wx.qlogo.cn/mmopen/Xmnun9Io49RNluabNPIibRWwagMHc60vDrrfUx8hYEVibWOUYFKQ6jibfkdJTmhfQmLepOEfVCJmOibvKnwwtfAHibQ/0"},"touser":null,"type":1},{"id":"42842","quote":"我想说的是 能否放些有深度的文章？ 生活不是只有爱情","content":"可能是别的太残酷，不适合写出来看吧\n爱情算是生活里最简单的东西了","praisenum":2,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-06 02:55:44","created_at":"2017-06-06 02:55:44","updated_at":"0000-00-00 00:00:00","user":{"user_id":"7953455","user_name":"小艾勒","web_url":"http://wx.qlogo.cn/mmopen/MhxEry0zJv7HY1Uq1q5v1HyHSvBO5tHgT1dSzh7Lb3JNubNSPESQrbYUGic3uR9cUaqbsUiciaUa7PAaeIuaicFbCA/0"},"touser":{"user_id":"4847462","user_name":"春雨里洗过的太阳","web_url":"http://image.wufazhuce.com/FgTepHqccKbmEH3vrhYnfCrxJVmP"},"type":1},{"id":"42841","quote":"","content":"天黑时躺下，天亮坐了起来，只为分清昼夜","praisenum":2,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-06 00:53:57","created_at":"2017-06-06 00:53:57","updated_at":"0000-00-00 00:00:00","user":{"user_id":"7609892","user_name":"遥望","web_url":"http://wx.qlogo.cn/mmopen/Xmnun9Io49QOCq9yykT2cJkDv8yNUqLC7MLia7CGB8CegSuFPvPVx5SPbF4RmPmzfB3Cz2PtahGynI4ZWldJ8Nw/0"},"touser":null,"type":1},{"id":"42840","quote":"","content":"图呢","praisenum":0,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-06 00:39:04","created_at":"2017-06-06 00:39:04","updated_at":"0000-00-00 00:00:00","user":{"user_id":"8067708","user_name":"清算","web_url":"http://q.qlogo.cn/qqapp/1104596227/1FDB83872F79AADC6CC6892891DAD0A2/40"},"touser":null,"type":1},{"id":"42838","quote":"","content":"写得真不错。","praisenum":1,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-06 00:11:05","created_at":"2017-06-06 00:11:05","updated_at":"0000-00-00 00:00:00","user":{"user_id":"7143537","user_name":"安墨","web_url":"http://q.qlogo.cn/qqapp/1104596227/25F969ADC4E60F124F217595347F4A0A/40"},"touser":null,"type":1},{"id":"42834","quote":"","content":"想你了，却不敢打扰","praisenum":1,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-05 23:28:11","created_at":"2017-06-05 23:28:11","updated_at":"0000-00-00 00:00:00","user":{"user_id":"8056664","user_name":"哇塞塞塞🤣","web_url":"http://q.qlogo.cn/qqapp/1104596227/1893391F96D897ED2E926D6782B8DFAF/100"},"touser":null,"type":1}]}
     */

    private int res;
    private DataBeanX data;

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public DataBeanX getData() {
        return data;
    }

    public void setData(DataBeanX data) {
        this.data = data;
    }

    public static class DataBeanX {
        /**
         * count : 124
         * data : [{"id":"42289","quote":"","content":"太好了你没死\n对啊我睡着了\n(太萌了)","praisenum":111,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-02 09:33:47","created_at":"2017-06-02 09:33:47","updated_at":"0000-00-00 00:00:00","user":{"user_id":"6574935","user_name":"你兜里只有五块钱","web_url":"http://wx.qlogo.cn/mmopen/hLxK5cQqoPYoaAGjxZJfWA2tEkEiaeKE7qXo5hRPibf2nv62gUU7qhwllScBPTHeaYWV08Y2O8XHLuBIvtmUceibX5ITcdCiamnw/0"},"touser":null,"type":0},{"id":"42286","quote":"","content":"猎懒不是死神啊，他是来拯救海榴小姐的。","praisenum":71,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-02 09:20:34","created_at":"2017-06-02 09:20:34","updated_at":"0000-00-00 00:00:00","user":{"user_id":"7957501","user_name":"早安海棠","web_url":"http://image.wufazhuce.com/FhYaboqzrbpRBWdFchs1yP7XEeiX"},"touser":null,"type":0},{"id":"42300","quote":"","content":"原来人生最糟糕的结局不是失败，而是对方不在。","praisenum":62,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-02 11:22:45","created_at":"2017-06-02 11:22:45","updated_at":"0000-00-00 00:00:00","user":{"user_id":"7807101","user_name":"White Pony","web_url":"http://q.qlogo.cn/qqapp/1104596227/9F5F60DA7246B0F0E12A5F7D5AB03033/100"},"touser":null,"type":0},{"id":"42305","quote":"","content":"为什么我觉得这个故事好温暖😊","praisenum":38,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-02 13:21:05","created_at":"2017-06-02 13:21:05","updated_at":"0000-00-00 00:00:00","user":{"user_id":"7026849","user_name":"🐙","web_url":"http://q.qlogo.cn/qqapp/1104596227/F21EF766B74DF031635BAAFB2006A174/40"},"touser":null,"type":0},{"id":"42415","quote":"","content":"思念是你睡了，我还在傻傻得翻着关于你的一切","praisenum":23,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-04 07:30:49","created_at":"2017-06-04 07:30:49","updated_at":"0000-00-00 00:00:00","user":{"user_id":"7993469","user_name":"而立之年惑余生","web_url":"http://wx.qlogo.cn/mmopen/ajNVdqHZLLDN1Do6oevWiaL7iaRhic6Xq6Yx0ZSlGOowtpL8iaphACl83pBrHm6WicVabjYRnRfIGDpIz0emyzCalibNPL3UDStXKN9kYFeF44aXM/0"},"touser":null,"type":0},{"id":"42303","quote":"","content":"为了女王下了ONE。","praisenum":23,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-02 11:59:43","created_at":"2017-06-02 11:59:43","updated_at":"0000-00-00 00:00:00","user":{"user_id":"5595248","user_name":"ATLAS","web_url":"http://image.wufazhuce.com/FvwLm6_0rtBKqApE94Wac1NaiFls"},"touser":null,"type":0},{"id":"42295","quote":"","content":"每次的题记简直经典","praisenum":22,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-02 10:52:26","created_at":"2017-06-02 10:52:26","updated_at":"0000-00-00 00:00:00","user":{"user_id":"2177722","user_name":"天天想放假","web_url":"http://tp4.sinaimg.cn/1174093963/180/5699939122/0"},"touser":null,"type":0},{"id":"42317","quote":"","content":"太暖了","praisenum":9,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-02 17:45:19","created_at":"2017-06-02 17:45:19","updated_at":"0000-00-00 00:00:00","user":{"user_id":"5505731","user_name":"ސސ    ސސސސސސސސސސސސ","web_url":"http://q.qlogo.cn/qqapp/1104596227/4007C99B2DFED249B2C4AB146096B2AC/40"},"touser":null,"type":0},{"id":"43038","quote":"","content":"谁是谁是死神，谁又是谁的救星","praisenum":0,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-09 08:31:04","created_at":"2017-06-09 08:31:04","updated_at":"0000-00-00 00:00:00","user":{"user_id":"8034773","user_name":"喵菌","web_url":"http://wx.qlogo.cn/mmopen/glb9kzB1HGZxQtzubXjNud1fpNdkL4bsRcDelgkJyicBcPntqiaK73yrlyRu7P83dbDR5fOVV2JGZQlSdNOhJzjN0468e6b7SC/0"},"touser":null,"type":1},{"id":"43002","quote":"","content":"我都连续失眠十年了吧，从小学开始失眠的。","praisenum":0,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-08 22:40:56","created_at":"2017-06-08 22:40:56","updated_at":"0000-00-00 00:00:00","user":{"user_id":"7097566","user_name":"华沙","web_url":"http://q.qlogo.cn/qqapp/1104596227/B71193600F70EB3D1A8EB8EC090A90A1/40"},"touser":null,"type":1},{"id":"42987","quote":"","content":"这篇文章以前在最小说上发过吧 好熟悉","praisenum":0,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-08 18:00:10","created_at":"2017-06-08 18:00:10","updated_at":"0000-00-00 00:00:00","user":{"user_id":"3020744","user_name":"布崽子a","web_url":"http://tp3.sinaimg.cn/2883689374/180/5674389001/0"},"touser":null,"type":1},{"id":"42985","quote":"祝我明天的文综和英语能考个好成绩","content":"考的怎么样？","praisenum":0,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-08 17:22:22","created_at":"2017-06-08 17:22:22","updated_at":"0000-00-00 00:00:00","user":{"user_id":"7992509","user_name":"杨柳岸","web_url":"http://wx.qlogo.cn/mmopen/mIuibiaBIGnQGGavAWoviaibD4BmLIknSOOg8ibqMlibk5hibGLwq2LGJlx5gJrDY3hTAVqVN0QqwEXopFNV2cfO40QmW9ibdat6cTN3/0"},"touser":{"user_id":"6081000","user_name":"君和惜","web_url":"http://q.qlogo.cn/qqapp/1104596227/8E22DAAC90AD50F3A34B4B7B85379F76/100"},"type":1},{"id":"42976","quote":"","content":"什么是二次元，三次元？这是学术名词还是网络名词？我out了","praisenum":0,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-08 13:05:25","created_at":"2017-06-08 13:05:25","updated_at":"0000-00-00 00:00:00","user":{"user_id":"6920455","user_name":"茶未喝光已变酸","web_url":"http://image.wufazhuce.com/Fh5jWM-d8xaexM6_coPIs7ncHqdU"},"touser":null,"type":1},{"id":"42948","quote":"我想说的是 能否放些有深度的文章？ 生活不是只有爱情","content":"你这么缺营养？","praisenum":4,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-08 07:01:20","created_at":"2017-06-08 07:01:20","updated_at":"0000-00-00 00:00:00","user":{"user_id":"5601160","user_name":"Healer","web_url":"http://image.wufazhuce.com/Fhm72ISGKfm5I3UQnd2dnWJuq3Yy"},"touser":{"user_id":"4847462","user_name":"春雨里洗过的太阳","web_url":"http://image.wufazhuce.com/FgTepHqccKbmEH3vrhYnfCrxJVmP"},"type":1},{"id":"42944","quote":"","content":"可能你不快乐，可我要你快乐。","praisenum":1,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-08 01:01:19","created_at":"2017-06-08 01:01:19","updated_at":"0000-00-00 00:00:00","user":{"user_id":"8053611","user_name":"*** **** 4982","web_url":"http://image.wufazhuce.com/app3.0head.png"},"touser":null,"type":1},{"id":"42934","quote":"","content":"祝我明天的文综和英语能考个好成绩","praisenum":5,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-07 23:09:41","created_at":"2017-06-07 23:09:41","updated_at":"0000-00-00 00:00:00","user":{"user_id":"6081000","user_name":"君和惜","web_url":"http://q.qlogo.cn/qqapp/1104596227/8E22DAAC90AD50F3A34B4B7B85379F76/100"},"touser":null,"type":1},{"id":"42895","quote":"","content":"好可爱好温暖的故事","praisenum":0,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-07 13:09:14","created_at":"2017-06-07 13:09:14","updated_at":"0000-00-00 00:00:00","user":{"user_id":"1472719","user_name":"廖廖廖廖终于喜欢雨下整夜","web_url":"http://image.wufazhuce.com/Fsy7ACSa85T0gAFRvKJ92sggPcXt"},"touser":null,"type":1},{"id":"42890","quote":"","content":"头发会长 身材会瘦 不是为了你的到来 是因为你的离开","praisenum":2,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-07 11:24:55","created_at":"2017-06-07 11:24:55","updated_at":"0000-00-00 00:00:00","user":{"user_id":"6737147","user_name":"Glory","web_url":"http://image.wufazhuce.com/FmskTzBUBAdhpcebYTqrWVrnvP7v"},"touser":null,"type":1},{"id":"42884","quote":"","content":"爱情是一个人的兵荒马乱","praisenum":2,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-07 08:59:09","created_at":"2017-06-07 08:59:09","updated_at":"0000-00-00 00:00:00","user":{"user_id":"7227872","user_name":"微微橙","web_url":"http://image.wufazhuce.com/FohGvuOy4-4mbUnSmo65jT6WFDc6"},"touser":null,"type":1},{"id":"42867","quote":"","content":"怎么看全文","praisenum":0,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-06 23:57:42","created_at":"2017-06-06 23:57:42","updated_at":"0000-00-00 00:00:00","user":{"user_id":"6753548","user_name":"見字如面","web_url":"http://wx.qlogo.cn/mmopen/hLxK5cQqoPYVNUHbEY57ElkHWKDdibxDibyG4K2eia54ice6rNdSo45JAEj3nD53YuMicvNTmbufgZnvjr0suXQiajGuM7ia0aDbF48/0"},"touser":null,"type":1},{"id":"42859","quote":"猎懒不是死神啊，他是来拯救海榴小姐的。","content":"不管你在多少人眼里是死神，但总有一个人你对他而言是救星","praisenum":2,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-06 18:01:54","created_at":"2017-06-06 18:01:54","updated_at":"0000-00-00 00:00:00","user":{"user_id":"392547","user_name":"byway下火海","web_url":"http://tp2.sinaimg.cn/2506615561/180/40030807319/0"},"touser":{"user_id":"7957501","user_name":"早安海棠","web_url":"http://image.wufazhuce.com/FhYaboqzrbpRBWdFchs1yP7XEeiX"},"type":1},{"id":"42854","quote":"","content":"喜欢这样的故事","praisenum":0,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-06 14:14:50","created_at":"2017-06-06 14:14:50","updated_at":"0000-00-00 00:00:00","user":{"user_id":"7997144","user_name":"黑色幽默","web_url":"http://q.qlogo.cn/qqapp/1104596227/08715F96EE2DF8904A4549120FCD0785/40"},"touser":null,"type":1},{"id":"42843","quote":"","content":"如果开始 那就要有结束的准备？ \n可是我怕结束","praisenum":1,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-06 03:01:19","created_at":"2017-06-06 03:01:19","updated_at":"0000-00-00 00:00:00","user":{"user_id":"8055378","user_name":"吴力山","web_url":"http://wx.qlogo.cn/mmopen/Xmnun9Io49RNluabNPIibRWwagMHc60vDrrfUx8hYEVibWOUYFKQ6jibfkdJTmhfQmLepOEfVCJmOibvKnwwtfAHibQ/0"},"touser":null,"type":1},{"id":"42842","quote":"我想说的是 能否放些有深度的文章？ 生活不是只有爱情","content":"可能是别的太残酷，不适合写出来看吧\n爱情算是生活里最简单的东西了","praisenum":2,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-06 02:55:44","created_at":"2017-06-06 02:55:44","updated_at":"0000-00-00 00:00:00","user":{"user_id":"7953455","user_name":"小艾勒","web_url":"http://wx.qlogo.cn/mmopen/MhxEry0zJv7HY1Uq1q5v1HyHSvBO5tHgT1dSzh7Lb3JNubNSPESQrbYUGic3uR9cUaqbsUiciaUa7PAaeIuaicFbCA/0"},"touser":{"user_id":"4847462","user_name":"春雨里洗过的太阳","web_url":"http://image.wufazhuce.com/FgTepHqccKbmEH3vrhYnfCrxJVmP"},"type":1},{"id":"42841","quote":"","content":"天黑时躺下，天亮坐了起来，只为分清昼夜","praisenum":2,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-06 00:53:57","created_at":"2017-06-06 00:53:57","updated_at":"0000-00-00 00:00:00","user":{"user_id":"7609892","user_name":"遥望","web_url":"http://wx.qlogo.cn/mmopen/Xmnun9Io49QOCq9yykT2cJkDv8yNUqLC7MLia7CGB8CegSuFPvPVx5SPbF4RmPmzfB3Cz2PtahGynI4ZWldJ8Nw/0"},"touser":null,"type":1},{"id":"42840","quote":"","content":"图呢","praisenum":0,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-06 00:39:04","created_at":"2017-06-06 00:39:04","updated_at":"0000-00-00 00:00:00","user":{"user_id":"8067708","user_name":"清算","web_url":"http://q.qlogo.cn/qqapp/1104596227/1FDB83872F79AADC6CC6892891DAD0A2/40"},"touser":null,"type":1},{"id":"42838","quote":"","content":"写得真不错。","praisenum":1,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-06 00:11:05","created_at":"2017-06-06 00:11:05","updated_at":"0000-00-00 00:00:00","user":{"user_id":"7143537","user_name":"安墨","web_url":"http://q.qlogo.cn/qqapp/1104596227/25F969ADC4E60F124F217595347F4A0A/40"},"touser":null,"type":1},{"id":"42834","quote":"","content":"想你了，却不敢打扰","praisenum":1,"device_token":"","del_flag":"0","reviewed":"0","user_info_id":"0","input_date":"2017-06-05 23:28:11","created_at":"2017-06-05 23:28:11","updated_at":"0000-00-00 00:00:00","user":{"user_id":"8056664","user_name":"哇塞塞塞🤣","web_url":"http://q.qlogo.cn/qqapp/1104596227/1893391F96D897ED2E926D6782B8DFAF/100"},"touser":null,"type":1}]
         */

        private int count;
        private List<DataBean> data;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * id : 42289
             * quote :
             * content : 太好了你没死
             对啊我睡着了
             (太萌了)
             * praisenum : 111
             * device_token :
             * del_flag : 0
             * reviewed : 0
             * user_info_id : 0
             * input_date : 2017-06-02 09:33:47
             * created_at : 2017-06-02 09:33:47
             * updated_at : 0000-00-00 00:00:00
             * user : {"user_id":"6574935","user_name":"你兜里只有五块钱","web_url":"http://wx.qlogo.cn/mmopen/hLxK5cQqoPYoaAGjxZJfWA2tEkEiaeKE7qXo5hRPibf2nv62gUU7qhwllScBPTHeaYWV08Y2O8XHLuBIvtmUceibX5ITcdCiamnw/0"}
             * touser : null
             * type : 0
             */

            private String id;
            private String quote;
            private String content;
            private int praisenum;
            private String device_token;
            private String del_flag;
            private String reviewed;
            private String user_info_id;
            private String input_date;
            private String created_at;
            private String updated_at;
            private UserBean user;
            private UserBean touser;
            private int type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getQuote() {
                return quote;
            }

            public void setQuote(String quote) {
                this.quote = quote;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public int getPraisenum() {
                return praisenum;
            }

            public void setPraisenum(int praisenum) {
                this.praisenum = praisenum;
            }

            public String getDevice_token() {
                return device_token;
            }

            public void setDevice_token(String device_token) {
                this.device_token = device_token;
            }

            public String getDel_flag() {
                return del_flag;
            }

            public void setDel_flag(String del_flag) {
                this.del_flag = del_flag;
            }

            public String getReviewed() {
                return reviewed;
            }

            public void setReviewed(String reviewed) {
                this.reviewed = reviewed;
            }

            public String getUser_info_id() {
                return user_info_id;
            }

            public void setUser_info_id(String user_info_id) {
                this.user_info_id = user_info_id;
            }

            public String getInput_date() {
                return input_date;
            }

            public void setInput_date(String input_date) {
                this.input_date = input_date;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public String getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(String updated_at) {
                this.updated_at = updated_at;
            }

            public UserBean getUser() {
                return user;
            }

            public void setUser(UserBean user) {
                this.user = user;
            }

            public UserBean getTouser() {
                return touser;
            }

            public void setTouser(UserBean touser) {
                this.touser = touser;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public static class UserBean {
                /**
                 * user_id : 6574935
                 * user_name : 你兜里只有五块钱
                 * web_url : http://wx.qlogo.cn/mmopen/hLxK5cQqoPYoaAGjxZJfWA2tEkEiaeKE7qXo5hRPibf2nv62gUU7qhwllScBPTHeaYWV08Y2O8XHLuBIvtmUceibX5ITcdCiamnw/0
                 */

                private String user_id;
                private String user_name;
                private String web_url;

                public String getUser_id() {
                    return user_id;
                }

                public void setUser_id(String user_id) {
                    this.user_id = user_id;
                }

                public String getUser_name() {
                    return user_name;
                }

                public void setUser_name(String user_name) {
                    this.user_name = user_name;
                }

                public String getWeb_url() {
                    return web_url;
                }

                public void setWeb_url(String web_url) {
                    this.web_url = web_url;
                }
            }
        }
    }
}
