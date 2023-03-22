$(document).ready(function(){

    $.post("aa/txl", {"bha": 2021, "xma": 05, "dha": 13},
        function (data) {
        ///
        //     shuju="[['Firefox',45.0],['IE',96.8],{ name: 'Chrome',y: 72.8,sliced: true,selected: true},['Safari',8.5],['Opera',6.2],['Others',0.7]]"

            biaoti=data.bt;
            xin=eval(data.sj)
            var chart = Highcharts.chart('container', {
                chart: {
                    type: 'pie',
                    options3d: {
                        enabled: true,
                        alpha: 45,
                        beta: 0
                    }
                },
                title: {
                    text: biaoti
                },
                tooltip: {
                    pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
                },
                plotOptions: {
                    pie: {
                        allowPointSelect: true,
                        cursor: 'pointer',
                        depth: 35,
                        dataLabels: {
                            enabled: true,
                            format: '{point.name}'
                        }
                    }
                },
                series: [{
                    type: 'pie',
                    name: '浏览器占比',
                    data: xin
                }]
            });


        ///


        });

});

////

////