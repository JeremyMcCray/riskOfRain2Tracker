package com.riskofraintracker.riskOfRain2Tracker.services;

import com.riskofraintracker.riskOfRain2Tracker.models.RunReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.riskofraintracker.riskOfRain2Tracker.repositories.RunReportRepo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;

@Service
public class RunReportService {

    RunReportRepo runReportRepo;

    @Autowired
    public RunReportService(RunReportRepo reportRepo){
        runReportRepo = reportRepo;
    }



    public Optional<RunReport> findById(Long id){
        return runReportRepo.findById(id);
    }

    public RunReport saveCurrentRun(){
                try {
            InputStream is = new FileInputStream("C:\\Program Files (x86)\\Steam\\SteamApps\\common\\Risk of Rain 2\\Risk of Rain 2_Data\\RunReports\\PreviousRun.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(RunReport.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            RunReport runReport = (RunReport) jaxbUnmarshaller.unmarshal(is);
            //set Run report to playerinfo
            runReport.getPlayerInfos().setRunReport(runReport);
            //set playerinfos to the playerinfo
            runReport.getPlayerInfos().getPlayerInfo().setPlayerInfos(runReport.getPlayerInfos());

            runReport.getPlayerInfos().getPlayerInfo().getStatSheet().setPlayerInfo(runReport.getPlayerInfos().getPlayerInfo());
            runReport.getPlayerInfos().getPlayerInfo().getStatSheet().getFields().setStatSheet(runReport.getPlayerInfos().getPlayerInfo().getStatSheet());
            runReport.getPlayerInfos().getPlayerInfo().getItemStacks().setPlayerInfo(runReport.getPlayerInfos().getPlayerInfo());

            runReportRepo.save(runReport);

            return runReport;
        } catch(Exception e){
            e.printStackTrace();
        }
                return null;
    }

    public List<RunReport> getAll(){
        return runReportRepo.findAll();
    }
}
